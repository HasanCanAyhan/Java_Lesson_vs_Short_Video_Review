package java_lab.lab14_ecommerceApplicationTasks;

import java_lab.lab14_ecommerceApplicationTasks.discount.Discount;

import java.util.Map;
import java.util.UUID;

public class Cart {

    private Customer customer;

   // private Discount discountId; ? why it is not correct?

    private UUID discountId; // check if it is eligible or not, then implement

    private Map<Product,Integer> productMap;



    public Cart(Customer customer) {
        this.customer = customer;
    }

    public Cart(Customer customer, UUID discountId, Map<Product, Integer> productMap) {
        this.customer = customer;
        this.discountId = discountId;
        this.productMap = productMap;
    }


    public Double calculateCartTotalAmount(){

        double totalAmount = 0;

        for (Product product : productMap.keySet()) { // it returns each product

            totalAmount += product.getPrice() * productMap.get(product);
            //                 price of product *  quantity(value:Integer of ProductMap)

        }

        return totalAmount;

    }



    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public UUID getDiscountId() {
        return discountId;
    }

    public void setDiscountId(UUID discountId) {
        this.discountId = discountId;
    }

    public Map<Product, Integer> getProductMap() {
        return productMap;
    }

    public void setProductMap(Map<Product, Integer> productMap) {
        this.productMap = productMap;
    }


}
