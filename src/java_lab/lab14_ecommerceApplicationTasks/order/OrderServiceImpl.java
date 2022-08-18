package java_lab.lab14_ecommerceApplicationTasks.order;

import java_lab.lab14_ecommerceApplicationTasks.Cart;
import java_lab.lab14_ecommerceApplicationTasks.StaticConstants;
import java_lab.lab14_ecommerceApplicationTasks.checkout.CheckoutService;
import java_lab.lab14_ecommerceApplicationTasks.checkout.CustomerBalanceCheckoutServiceImpl;
import java_lab.lab14_ecommerceApplicationTasks.checkout.MixPaymentCheckoutServiceImpl;
import java_lab.lab14_ecommerceApplicationTasks.discount.Discount;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.UUID;

public class OrderServiceImpl implements OrderService{

    @Override
    public String placeOrder(Cart cart) {

        double amountAfterDiscount = cart.calculateCartTotalAmount(); // right now total amount
        // ex: cart has 400 --->> threshold for amountBasedDiscount :  250 Free 50
        // after discount (amountBased Discount )350

        if (cart.getDiscountId() != null){
            try {
                Discount discount = findDiscountById(cart.getDiscountId());
                amountAfterDiscount = discount.calculateCartAmountAfterDiscountApplied(amountAfterDiscount);
                //                               we did not implement the method
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

        //Payment Part

        Scanner scanner = new Scanner(System.in);
        System.out.println("which payment option you would like to choose, Type 1 : customer balance, Type 2 : Mix (gift card + customer balance)");
        int paymentType = scanner.nextInt();
        boolean checkoutResult = false;

        switch (paymentType){

            case 1: // customerB

                CheckoutService customerBalanceCheckoutService = new CustomerBalanceCheckoutServiceImpl();
                checkoutResult = customerBalanceCheckoutService.checkout(cart.getCustomer(),amountAfterDiscount);

                break;


            case 2://giftCardB

                CheckoutService mixPaymentCheckoutService = new MixPaymentCheckoutServiceImpl();
                checkoutResult = mixPaymentCheckoutService.checkout(cart.getCustomer(),amountAfterDiscount);

                break;

        }


        if (checkoutResult){ // if there is no problem

            // creating order

            Order order = new Order(UUID.randomUUID(), LocalDateTime.now(),
                    cart.calculateCartTotalAmount(), amountAfterDiscount,
                    cart.calculateCartTotalAmount() - amountAfterDiscount,
                    cart.getCustomer().getId(),
                    "Placed",cart.getProductMap().keySet());

            StaticConstants.ORDER_LIST.add(order);

            return "Order has been placed successfully";

        }else{
            return "Balance is insufficient. Please add money to your one of balances and try again.";
        }



    }

    private Discount findDiscountById(UUID discountId) throws Exception {

        for (Discount discount : StaticConstants.DISCOUNT_LIST) {

            if (discount.getId().toString().equals(discountId.toString())){
                return discount;
            }

        }

        throw new Exception("Discount could not found");

    }


}
