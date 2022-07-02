package java_lab.lab08_lab09_SplitterApp.easyway;

import java.util.ArrayList;
import java.util.List;

public class User {


    public String name;
    public String email;
    public List<Expense> expenses;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.expenses = new ArrayList<>();
    }

    public void addExpense(Expense expense){
        this.expenses.add(expense);
    }

    public int getTotalExpenseAmount(){
        int result = 0;
        for (Expense expense : expenses){
            result += expense.amount;
        }
        return result;
    }

}
