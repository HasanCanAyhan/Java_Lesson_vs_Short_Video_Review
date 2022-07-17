package java_lab.lab12_oop_exceptions.restaurantTask_byme;

public class Server extends Employee{


    public Server(String name, String jobTitle, int age, char gender, String id, double salary) {
        super(name, jobTitle, age, gender, id, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is serving the customers");
    }

    public void takeOrder(){
        System.out.println(getName() + " is taking orders");
    }

    public void cleanTable(){
        System.out.println(getName() + " is cleaning table");
    }

    //     return Type because Server will be promoted to Chef
    public Chef prometedToChef(){
        return new Chef(getName(),getJobTitle(),getAge(),getGender(),getId(),getSalary());
    }



}
/*

	5. Create a subclass of employee named Server

			extra methods:
				takeOrder()
				cleanTable()
 */