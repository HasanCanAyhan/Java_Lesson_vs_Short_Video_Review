package OOP_Tasks_byMe.bankAccountManagement;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {

    HashMap<Integer,Accounts>  accountsData = new HashMap<>();
    int generatePin(){
        Random random = new Random();
        int a = random.nextInt(9), b = random.nextInt(9);
        int pinNo = 1000 + ( a * b );
        return  pinNo;

    }

    void register(){

        while (true) {


            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your account no : ");
            int acNo = scanner.nextInt();
            if (acNo > 100000 && acNo < 999999) {
                System.out.println("Enter your account Name : ");
                String acName = scanner.next();
                if (acName != null) {
                    int generatePin = generatePin();
                    System.out.println("Re enter the pin number : " + generatePin);
                    int pinNo = scanner.nextInt();
                    if (pinNo == generatePin) {
                        System.out.println("Enter Initial Deposit amount: ");
                        int depAmt = scanner.nextInt();
                        if (depAmt >= 999) {

                            Accounts accounts = new Accounts(acName,pinNo,depAmt);
                            accountsData.put(acNo,accounts);
                            System.out.println("Account successfully created.Please log in to continue");
                            login();
                            break;
                        } else {
                            System.out.println("enter a valid amount");
                        }
                    } else {
                        System.out.println("enter a valid pin no");
                    }

                } else {
                    System.out.println("enter a valid account name");
                }

            } else {
                System.out.println("enter a valid account number");
            }

        }

    }

    void  login(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your account no : ");
        int acNo = scanner.nextInt();
        System.out.println("Enter your pin :");
        int pinNo = scanner.nextInt();

        for (Map.Entry<Integer, Accounts> entry : accountsData.entrySet()) {
            Accounts accounts = entry.getValue();

            if (acNo == entry.getKey() && pinNo == accounts.pinNumber){
                System.out.println("***************Account Info");
                System.out.println("Account no : " + entry.getKey());
                System.out.println("Account Name: " + accounts.accountName);
                System.out.println("Available Balance : " + accounts.depositAmount);
            }

        }


    }




    public static void main(String[] args) {

        Main main1 = new Main();
        main1.register();

    }


}
