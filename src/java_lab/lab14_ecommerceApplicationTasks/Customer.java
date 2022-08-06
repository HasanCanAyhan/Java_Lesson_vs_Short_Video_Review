package java_lab.lab14_ecommerceApplicationTasks;

import java.util.List;
import java.util.UUID;

public class Customer {

    private UUID id; // for unique id number
    private String userName;
    private String email;

    //private Address address; // wrong : only 1 address,  according to requirements , Customer can have more than one address
    private List<Address> address; // best : polymorphism (flexibility) -->> put it into Interface version
    // Interface abc = new Class(); -- >>> polymorphism




    // There are 2 Constructor for 2 option :  either : userName, email or userName,email,address

    public Customer(UUID id, String userName, String email) {
        this.id = id;
        this.userName = userName;
        this.email = email;
    }

    public Customer(UUID id, String userName, String email, List<Address> address) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.address = address;
    }

    public UUID getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public List<Address> getAddress() {
        return address;
    }

    /*
    // type name ;
    // Data Type : Class : Address address;


    if there is no Address address
    private String streetNumber;
    private String streetName;....


    // ArrayList<Address> abc = new ArrayList<>();
    // Class abc = new Class;
    // Interface abc = new Class(); -- >>> polymorphism


     */

}
