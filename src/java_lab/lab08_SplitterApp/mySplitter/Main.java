package java_lab.lab08_SplitterApp.mySplitter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // we create object and in order to use the feature of this class

        System.out.println("Welcome to Budget Planner!");

        // Ask how many people in the budget planner?





        // Create user : name , email

        //Users DB
         ArrayList<User> userList = prepareUserLists(scanner); // in order to hold users in the DataBase(ArrayList)
        // we are saving object in the arrayList belongs to User Class

        // Expense DB
        ArrayList<Expense> expenseList = new ArrayList<>(); // empty arrayList



        System.out.println("Added user count : " + userList.size()); // 2

        System.out.println("--------------------------------------");


        /*Creating options

        0 : Make Expense 1
        1 : List Specific Person Expense
        2 : List All Expenses
        3 : Make Split
        4 : List All Users
        5 : Close the budget  6

         */

        // next is Show the Menu

        String[] optionList = prepareOptionList();


        while(true) { // we want to see the menu again and we dont know how many times it will be, then because of that we created while loop

            System.out.println("What would you like to do?");

        for (int i = 0; i < optionList.length; i++) {

            System.out.println( optionList[i] + ":" + (i+1));

        }

        // Selecting options
        // for selecting options , we need to get info from scanner


            int request = scanner.nextInt(); // for selecting menu

            request--;// because the menu start with 0

            switch (request) {

                case 0: // Make Expense // request 1

                    // ask expense name, amount, user

                    // create object : because we keep it in the ArrayList
                    Expense expense = new Expense();

                    System.out.println("Expense name: "); // food
                    expense.expenseName = scanner.next(); // we assigned the info from Scanner into expense object

                    System.out.println("Expense amount: "); // 100$
                    expense.amount = scanner.nextInt();

                    System.out.println("Which user made this expense? Just type user id: ");

                    // show all users - we keep users in the userList Arraylist
                    // I want to print all users from system "ozzy" - "mike"
                    // So scanner can pick the expense user with id num(index number) --->> id : 0 - ozzy , id : 1 - mike

                    // userlList = { user(name, email) ,  user(name, email) }
                                //        user 0        ,      user1
                    for (User user : userList) {

                        System.out.println("id :" + userList.indexOf(user) + " name: " + user.name );
                    }

                    int userId = scanner.nextInt(); // to capture info from scanner to see which user to be selected

                    //User user = userList.get(userId); it returns object which is user
                    //expense.user = user.name;

                    expense.user =  userList.get(userId).name; // if userId = 0 --->> ozzy,  userId = 1 --->> mike

                    // to save the date : ArrayList :expenseList


                    expenseList.add(expense); // to save the coming object


                    break;

                case 1:// List Specific Person Expense  // request 2

                    System.out.println("Please provide user name that you would like to search");

                    String givenUserName = scanner.next(); // Ozzy

                    User myUser = null; // myUser is object! it has name and email

                    for (User chosenUser : userList) {

                        if (chosenUser.name.equals(givenUserName)){ // ozzy == ozzy
                          myUser = chosenUser; // chosenUser == givenUserName
                         // chosenUser.name = givenUserName;
                            // myUser.name = givenUserName;
                            break;
                        }
                                                                                // Line 119 ~ 134 for checking id the givenUserName is valid or not
                    }

                    if (myUser == null){
                        System.out.println("User not exists!"); // tom
                        break;
                    }


                    // List Specific Person Expense

                    // output : 0 - expense amount : 100 , expense by : Ozzy
                    // output : 1 - expense amount : 100 , expense by : Ozzy
                    // output : ozzy spent $ 200

                    int userExpenseAmount = 0;
                    int expenseCount = 0; // for reset

                    for (int i = 0; i < expenseList.size(); i++) {

                        if(expenseList.get(i).user.equals(myUser.name)){ //????? I WROTE SO !

                            userExpenseAmount += expenseList.get(i).amount;
                            expenseCount++;

                            System.out.println(expenseCount + " - expense amount : " + expenseList.get(i).amount + " , expense by : " + expenseList.get(i).user);

                        }

                    }

                    System.out.println(myUser.name + " spent $" + userExpenseAmount);


                    break;

                case 2://List All Expenses  // request 3

                    //  0 - expense amount : 100 , expense by : ozzy
                    //  1 - expense amount : 30 , expense by : ozzy
                    //  2 - expense amount : 20 , expense by :  mike

                    for (int i = 0; i < expenseList.size(); i++) { // expenseList is holding expense objects

                        System.out.println( i + " - expense amount : " + expenseList.get(i).amount + " , expense by : " + expenseList.get(i).user   );

                    }

                    break;

                case 3:// Make Split  // request 4 // we will find the total expense

                    // find total

                    double totalAmount = 0;
                    ArrayList<Split> splitList = calculateSplitByUser(expenseList); // we need to have expenseList in order to calculate total
                    // it is ready , it cames from calculateSplitByUser

                    for (Split split : splitList) {

                        totalAmount += split.amount;

                    }

                    makeSplit(totalAmount,splitList); // as splitList parameter, we need to find size : totalAmount / splitList.size()
                    // last Thing



                    break;

                case 4: // List All Users  // request 5
                    break;

                case 5: //  Close the budget  // request 6
                    System.exit(0);
                    break;

            }


        }



    }

    private static void makeSplit(double totalAmount, ArrayList<Split> splitList) {


        double amount = totalAmount / splitList.size();

        // total 300
        // eachperson : 150
        // find debt/ credit

        for (Split split : splitList) {

            if (split.amount > amount){
                System.out.println(split.userName + " needs to take back " + (split.amount - amount));
            }else{
                System.out.println(split.userName + " needs to give back " +  (-1 * (split.amount -amount)));
            }

        }

    }

    private static ArrayList<Split> calculateSplitByUser(ArrayList<Expense> expenseList) {

        ArrayList<Split> splitList = new ArrayList<>(); // empty list



        for (Expense expense : expenseList) {

            Split split = existSplitList(expense.user,splitList);

            if(split != null){ // that means object is already exists. such as ozzy

                split.amount += expense.amount;

            }else{ // that means split object is null / doesn´t exist
                Split willbeAdded = new Split(); // we created new split object
                willbeAdded.userName = expense.user; // such as mike
                willbeAdded.amount = expense.amount;

                splitList.add(willbeAdded);
            }


        }

        return splitList;

    }

    public static Split existSplitList(String userName, ArrayList<Split> splitList) { // checking if the object existing or not

        for (Split split : splitList) {

            if(split.userName.equals(userName)){ // if split.username equals to userName you don´t need to create another object
                return split; // current object
            }

        }

        return null; // if returns null, then create new object


    }

    public static ArrayList<User> prepareUserLists(Scanner scanner){
        //                                         Class Type object

        ArrayList<User> userList = new ArrayList<>();

        System.out.println("How many people will split the budget?");
        int userCount = scanner.nextInt(); // 2



        for (int i = 0; i < userCount ; i++) {



            User user = new User(); // for loop 2 times : ozzy/ mike
            //user.name = "can";
            //user.email = "can@gmail.com";


            // User Information comes from Scanner
            System.out.println("name:");
            user.name = scanner.next(); // from scanner the input : ozzy
            //object : user  attribute : name / email

            System.out.println("email:");
            user.email = scanner.next(); // from scanner the input : ozzy@gmail.com

            userList.add(user);// in order to send this info into ArrayList and to hold/save  this info
            // we are trying to save object into arraylist , which is here user.
        }


        return userList;

    }

    public static String[] prepareOptionList(){



        String[] optionList = {"Make Expense", // index 0
                "List Specific Person Expense",  // index 1
                "List All Expenses", // index 2
                "Make Split", // index 3
                "List All Users", // index 4
                "Close the budget"}; // index 5

        return optionList;

    }


}
