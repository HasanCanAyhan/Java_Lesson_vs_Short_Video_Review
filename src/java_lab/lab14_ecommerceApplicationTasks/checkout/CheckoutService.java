package java_lab.lab14_ecommerceApplicationTasks.checkout;

import java_lab.lab14_ecommerceApplicationTasks.Customer;

public interface CheckoutService {

    boolean checkout(Customer customer, Double totalAmount);

}
