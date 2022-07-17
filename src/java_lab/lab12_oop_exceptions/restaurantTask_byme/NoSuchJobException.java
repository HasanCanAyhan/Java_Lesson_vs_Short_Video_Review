package java_lab.lab12_oop_exceptions.restaurantTask_byme;

public class NoSuchJobException extends RuntimeException{ // custom exception

    public NoSuchJobException(String exceptionMsg) {// parent class constructor  displays the specified message as an exception message
        //System.out.println(exceptionMsg);
        super(exceptionMsg);
    }

        /*
    public static void main(String[] args) {
        //throw  new RuntimeException("Something went wrong");
        throw new NoSuchJobException("Invalid Job");

    }


     */

}
/*
1. Create a subclass of RuntimeException named NoSuchJobException

			add a constructor with string argument that can display the specified string as an exception message
 */