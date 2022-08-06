package java_lab.lab14_ecommerceApplicationTasks.category;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class Category { //  parent class

    private UUID id;
    private String name;

    public Category(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public abstract LocalDateTime findDeliveryDueDate();

    public String generateCategoryCode(){
        return id.toString().substring(0,8).concat("-").concat(name.substring(0,2));
    }
    /*
    UUID is an object that has bunch of fields/variables in it. But we only need the ID it is providing us as String.
    For that it is using toString method internally and we are calling that.
     */

}
