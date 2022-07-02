package java_lab.lab08_lab09_SplitterApp.easyway;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainSplitter {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String[] optionList = {"List Specific Person Expense",
                "List All Expenses",
                "Make Split",
                "Close the budget"};

        //Users DB
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("ower", "ower@gmail.com"));
        userList.add(new User("hasan", "hasan@gmail.com"));
        userList.add(new User("boban", "boban@gmail.com"));

        //Expenses
        userList.get(0).addExpense(new Expense(100, "taxi"));
        userList.get(1).addExpense(new Expense(400, "hotel"));
        userList.get(2).addExpense(new Expense(100, "fun"));
        userList.get(0).addExpense(new Expense(100, "food"));


        while (true) {

            System.out.println("What would you like to do?");

            for (int i = 0; i < optionList.length; i++) {

                System.out.println(optionList[i] + ":" + (i + 1));

            }

            int request = scanner.nextInt();

            switch (request - 1) {


                case 0:

                    System.out.println("Which user you want to see expenses? Just type user id: ");

                    //show all users: id:0 name: Ower
                    for (User user : userList) {
                        System.out.println("id: " + userList.indexOf(user) + " name: " + user.name);
                    }


                    // get input
                    int userId = scanner.nextInt();
                    User user = userList.get(userId);

                    // Calculate all expenses made by this user
                    int expensesByUser = user.getTotalExpenseAmount();
                    System.out.println(user.name + " has spent " + expensesByUser + " total ");
                    break;

                case 1: //total expenses
                    System.out.println("Total " + calculateTotalExpenses(userList) + " money is spent...");
                    break;

                case 2: // split
                    makeSplit(calculateTotalExpenses(userList), userList);
                    break;

                case 3:
                    System.exit(0);


            }


        }


    }


    public static int calculateTotalExpenses(List<User> userList) {
        int totalExpenses = 0;
        for (User usr : userList) {
            totalExpenses += usr.getTotalExpenseAmount();
        }
        return totalExpenses;
    }

    public static void makeSplit(int totalExpenses, ArrayList<User> userList) {

        double averageAmount = totalExpenses / userList.size();

        for (User user : userList) {

            if (user.getTotalExpenseAmount() > averageAmount) {

                System.out.println(user.name + " needs to take back " + (user.getTotalExpenseAmount() - averageAmount));

            } else {

                System.out.println(user.name + " need to give " + (-1 * (user.getTotalExpenseAmount() - averageAmount)));
            }

        }


    }


}
