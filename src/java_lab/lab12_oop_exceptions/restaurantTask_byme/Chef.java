package java_lab.lab12_oop_exceptions.restaurantTask_byme;

public class Chef extends Employee{


    public Chef(String name, String jobTitle, int age, char gender, String id, double salary) {
        super(name, jobTitle, age, gender, id, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is cooking to customers");
    }

    public void makeOrder(){
        System.out.println(getName() + " is making orders");
    }
    public void washDishes(){
        System.out.println(getName() + " is washing dishes");
    }

}
/*
4. Create a subclass of employee named Chef

			extra methods:
				makeOrder()
				washDishes()
 */