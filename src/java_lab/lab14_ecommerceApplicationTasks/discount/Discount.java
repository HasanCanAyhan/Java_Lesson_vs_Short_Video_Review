package java_lab.lab14_ecommerceApplicationTasks.discount;

import java_lab.lab14_ecommerceApplicationTasks.Cart;

import java.util.UUID;

public abstract class Discount {

    private UUID id;
    private String name;
    private Double thresholdAmount; // we will use it in order to check if it is eligible or not

    public Discount(UUID id, String name, Double thresholdAmount) {
        this.id = id;
        this.name = name;
        this.thresholdAmount = thresholdAmount;
    }

    public abstract Double calculateCartAmountAfterDiscountApplied(Double amount);

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getThresholdAmount() {
        return thresholdAmount;
    }


    public boolean decideDiscountIsApplicableToCart(Cart cart) {

        return cart.calculateCartTotalAmount() > thresholdAmount;

    }


}
