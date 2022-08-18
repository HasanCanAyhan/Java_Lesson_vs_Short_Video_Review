package java_lab.lab14_ecommerceApplicationTasks.checkout;

import java_lab.lab14_ecommerceApplicationTasks.Customer;
import java_lab.lab14_ecommerceApplicationTasks.StaticConstants;
import java_lab.lab14_ecommerceApplicationTasks.balance.Balance;
import java_lab.lab14_ecommerceApplicationTasks.balance.CustomerBalance;
import java_lab.lab14_ecommerceApplicationTasks.balance.GiftCardBalance;

import java.util.UUID;

public class MixPaymentCheckoutServiceImpl implements CheckoutService{

    @Override
    public boolean checkout(Customer customer, Double totalAmount) {

        try {

            GiftCardBalance giftCardBalance = findGiftCardBalance(customer.getId());
            // 300 gift card balance
            // 450 customer balance

            // 600 in the cart

            // 300 - 600 = -300

            // 300 + 450 - 600 = 150

            final double giftBalance = giftCardBalance.getBalance() - totalAmount;

            if (giftBalance > 0) {
                giftCardBalance.setBalance(giftBalance);
                return true;
            } else {
                // 300 - 600 = -300
                // 300 + 450 - 600 = 150
                CustomerBalance customerBalance = findCustomerBalance(customer.getId());

                final double mixBalance = giftCardBalance.getBalance() + customerBalance.getBalance() - totalAmount;
                //            150       =            300                         450                       600

                if (mixBalance > 0) {
                    giftCardBalance.setBalance(0d);
                    customerBalance.setBalance(mixBalance);

                    return true;
                }

            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return false;
    }

    private GiftCardBalance findGiftCardBalance(UUID customerId) {

        for (Balance giftCardBalance : StaticConstants.GIFT_CARD_BALANCE_LIST) {

            if (giftCardBalance.getCustomerId().toString().equals(customerId.toString())){
                return (GiftCardBalance) giftCardBalance;
            }

        }

        GiftCardBalance giftCardBalance = new GiftCardBalance(customerId,0d);
        StaticConstants.GIFT_CARD_BALANCE_LIST.add(giftCardBalance);

        return giftCardBalance;

    }

    private static CustomerBalance findCustomerBalance(UUID customerId){
        for(Balance customerBalance : StaticConstants.CUSTOMER_BALANCE_LIST){
            if(customerBalance.getCustomerId().toString().equals(customerId.toString())){
                return (CustomerBalance) customerBalance;
            }
        }

        CustomerBalance customerBalance = new CustomerBalance(customerId,0d);
        StaticConstants.CUSTOMER_BALANCE_LIST.add(customerBalance);

        return customerBalance;
    }



}
