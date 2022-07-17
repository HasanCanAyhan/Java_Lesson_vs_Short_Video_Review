package java_lab.lab12_oop_exceptions.restaurantTask_byme;

public class NoSuchPersonException extends RuntimeException{

    public NoSuchPersonException(String message) {
        super(message);
    }


}
/*
2. Create a sub class of RuntimeException named NoSuchPersonException

			add a constructor with string argument that can display the specified string as an exception message
 */