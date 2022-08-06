package java_lab.lab14_ecommerceApplicationTasks.checkout;

import java_lab.lab14_ecommerceApplicationTasks.Customer;
import java_lab.lab14_ecommerceApplicationTasks.StaticConstants;
import java_lab.lab14_ecommerceApplicationTasks.balance.Balance;
import java_lab.lab14_ecommerceApplicationTasks.balance.CustomerBalance;

import java.util.UUID;

public class CustomerBalanceCheckoutServiceImpl implements CheckoutService{

    @Override
    public boolean checkout(Customer customer, Double totalAmount) {

        CustomerBalance customerBalance = findCustomerBalance(customer.getId());
        double finalBalance = customerBalance.getBalance() - totalAmount;

        if (finalBalance > 0 ){
            customerBalance.setBalance(finalBalance);
            return true;
        }

        return false; // if it is insuficient
    }

    private CustomerBalance findCustomerBalance(UUID customerId) {

        for (Balance customerBalance : StaticConstants.CUSTOMER_BALANCE_LIST) {

            if (customerBalance.getCustomerId().toString().equals(customerId.toString())){
                return (CustomerBalance) customerBalance;
            }

        }

        CustomerBalance customerBalance = new CustomerBalance(customerId,0d);
        StaticConstants.CUSTOMER_BALANCE_LIST.add(customerBalance);
        return customerBalance;
    }


}
