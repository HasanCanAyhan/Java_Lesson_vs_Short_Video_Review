package java_lab.lab14_ecommerceApplicationTasks;

import java_lab.lab14_ecommerceApplicationTasks.balance.Balance;
import java_lab.lab14_ecommerceApplicationTasks.balance.CustomerBalance;
import java_lab.lab14_ecommerceApplicationTasks.balance.GiftCardBalance;
import java_lab.lab14_ecommerceApplicationTasks.category.Category;
import java_lab.lab14_ecommerceApplicationTasks.discount.Discount;
import java_lab.lab14_ecommerceApplicationTasks.order.Order;
import java_lab.lab14_ecommerceApplicationTasks.order.OrderService;
import java_lab.lab14_ecommerceApplicationTasks.order.OrderServiceImpl;

import java.util.*;

public class Main {

    public static void main(String[] args)  {

        DataGenerator.createCustomer();
        DataGenerator.createCategory();
        DataGenerator.createProduct();
        DataGenerator.createBalance();
        DataGenerator.createDiscount();

        Scanner scanner = new Scanner(System.in);

        // Log in
        System.out.println("Select Customer");

        for (int i = 0; i < StaticConstants.CUSTOMER_LIST.size(); i++  ){
            System.out.println("Type " + i + " for customer: " + StaticConstants.CUSTOMER_LIST.get(i).getUserName());
        }

        Customer customer = StaticConstants.CUSTOMER_LIST.get(scanner.nextInt()); // int select = scanner.nextInt() --->>>  get(select)
        //                                                        i = 0, i = 1 for selecting customer

        Cart cart = new Cart(customer); // to find who is in the cart


        while(true){

            System.out.println("What would you like to do ? Just type id for selection");

            //Menu

            for (int i = 0; i < prepareMenuOptions().length ; i++) {
                System.out.println(i + " - " + prepareMenuOptions()[i]);
            }

            int menuSelection = scanner.nextInt();

            switch (menuSelection){
                case 0: // list Categories
                    for (Category category : StaticConstants.CATEGORY_LIST) {
                        System.out.println("Category Code: " + category.generateCategoryCode() + " category name: " + category.getName());
                    }

                    break;

                case 1: // list products : prints product name product category name

                    try{
                        for (Product product : StaticConstants.PRODUCT_LIST) {

                            System.out.println("Product Name : " + product.getName() + " Product Category Name : " + product.getCategoryName() );

                        }
                    }catch (Exception e){
                        System.out.println("Product could not printed because category not found for product name: " + e.getMessage().split(",")[1]);
                        //                                                                                            getMessage : "Category not found " + getName()
                    }


                    break;

                case 2: // List discounts

                    for (Discount discount : StaticConstants.DISCOUNT_LIST) {
                        System.out.println("Discount Name : " + discount.getName() + " discount threshold amount : " + discount.getThresholdAmount());
                    }

                    break;

                case 3: // see balance
                    // ozzy  customer balance  450, then gift card balance  0
                    // mike  customer balance  0, then gift card balance  550

                    //  Customer customer = StaticConstants.CUSTOMER_LIST.get(scanner.nextInt());

                    CustomerBalance cBalance = findCustomerBalance(customer.getId());
                    GiftCardBalance gBalance = findGiftCardBalance(customer.getId());

                    System.out.println("Your name is : " + customer.getUserName());
                    System.out.println("Your Customer Balance is : " + cBalance.getBalance());
                    System.out.println("Your Gift Card Balance is : " + gBalance.getBalance());

                    double totalBalance = cBalance.getBalance() + gBalance.getBalance();

                    System.out.println("Your Total Balance is : " + totalBalance);

                    break;

                case 4: // add balance

                    CustomerBalance customerBalance = findCustomerBalance(customer.getId());
                    GiftCardBalance giftCardBalance = findGiftCardBalance(customer.getId());

                    System.out.println("Which balance you would like to add");
                    System.out.println("Type 1 for Customer Balance: " + customerBalance.getBalance());
                    System.out.println("Type 2 for Gift Card Balance: " + giftCardBalance.getBalance());

                    int selectionForBalance = scanner.nextInt();

                    System.out.println("How much would you like to add: ");
                    double amountByCustomer = scanner.nextDouble();

                    switch (selectionForBalance){

                        case 1: // cBalance
                            customerBalance.addBalance(amountByCustomer);
                            System.out.println(amountByCustomer + " is added");
                            System.out.println("New Customer Balance is : " + customerBalance.getBalance());
                            break;

                        case 2:// gBalance
                            giftCardBalance.addBalance(amountByCustomer);
                            System.out.println(amountByCustomer + " is added");
                            System.out.println("New Gift Card Balance is : " + giftCardBalance.getBalance());
                            break;
                    }

                    break;

                    //-------------------------------------------------------------------------------
                case 5://  Place an order
                    // to buy product
                    // need to choose Product(s), to put it to Cart, check the Discount if it is eligible for discount or not, if so , then apply it to cart, then final calculate , then make an order

                    //built cart and put the products in to Cart

                    Map<Product,Integer> map = new HashMap<>();
                    cart.setProductMap(map); // in the cart we have empty map for putting the product in to it

                   while (true){ // for adding products

                       System.out.println("Which product you want to add to your cart.For exit product election Type : exit");

                       // for showing products
                       for (Product product : StaticConstants.PRODUCT_LIST) {

                           try { // try & catch is for  product.getCategoryName()
                               System.out.println("Product id : " + product.getId() +
                                       " price: " + product.getPrice() +
                                       " product category name: " + product.getCategoryName() +
                                       " stock: " + product.getRemainingStock() +
                                       " product delivery due: " + product.getDeliveryDueDate()); // category decide the product delivery due date
                           } catch (Exception e) {
                               System.out.println(e.getMessage());
                           }

                       }

                       // pick product from the DataBase-ProductList
                       String productId = scanner.next(); // with the productId we retrieve the product fromDataBase

                       try {
                           Product product = findProductById(productId); // we found the product

                           // put it in to map-cart but first you need to check if stock of product is available or not

                           if (!putItemToCartIfStockAvailable(cart,product)){ // you wanna buy 10 PS5 but stock is only 7, you can not buy it
                               System.out.println("The Stock of this product is insufficient.Try again with correct stock number ");
                               continue;
                           }


                       } catch (Exception e) {
                           System.out.println("Product does not exist.Please try again!");
                           continue;
                       }


                       System.out.println("Would you like to add more products. Type Y for adding more, N for existing");
                       String decision = scanner.next();

                       if (!decision.equals("Y")){ //--->> N exit
                           break; // break - inner while loop, go to back te outer while loop
                       }

                   }

                   // with Samuel

                    //for showing discount option
                    System.out.println("seems there are discount options. Do you want to see and apply to your cart if it is applicable. For no discount type no");
                    for (Discount discount : StaticConstants.DISCOUNT_LIST) {
                        System.out.println("Discount id " + discount.getId() + " discount name: " + discount.getName());
                    }

                    String discountId = scanner.next();

                    if (!discountId.equals("No")) {

                        try {
                            Discount discount = findDiscountById(discountId);

                            if (discount.decideDiscountIsApplicableToCart(cart)){ // inside the cart, we have method: calculateCartTotalAmount()
                                cart.setDiscountId(discount.getId());
                                // discount.getId : either amountBased or rateBased , then put it to cart

                            }

                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }

                    }

                    // order part - Interface

                    OrderService orderService = new OrderServiceImpl();
                    String result = orderService.placeOrder(cart);

                    if (result.equals("Order has been placed successfully")){
                        System.out.println("Order is successful");
                        updateProductStock(cart.getProductMap());// to decrease remaining stock
                        cart.setProductMap(new HashMap<>());
                        cart.setDiscountId(null);

                    }else{
                        System.out.println(result);
                    }

                    break;

                case 6:// See Cart
                    System.out.println("Your cart:");
                    if (! cart.getProductMap().keySet().isEmpty()){
                        for (Product product : cart.getProductMap().keySet()) {
                            System.out.println("product name: " + product.getName() + " count: " + cart.getProductMap().get(product));
                        }
                    }else{
                        System.out.println("Your cart is empty");
                    }

                    break;


                case 7: // //See order details
                    printOrdersByCustomerId(customer.getId());
                    break;

                case 8: // See your address
                    printAddressByCustomerId(customer);
                    break;

                case 9:
                    System.exit(0);
                    break;
            }


        }







    }

    private static void printAddressByCustomerId(Customer customer) {

        for (Address address : customer.getAddress()) {
            System.out.println(" Street Name: " + address.getStreetName() +
                    " Street Number: " + address.getStreetNumber() + "ZipCode:  "
                    + address.getZipCode() + " State: " + address.getState());
        }


    }

    private static void printOrdersByCustomerId(UUID customerId) {

        for (Order order : StaticConstants.ORDER_LIST) {

            if (order.getCustomerId().toString().equals(customerId.toString())){
                System.out.println("Order status: " + order.getOrderStatus() + " order amount " + order.getPaidAmount() + " order date " + order.getOrderDate());
            }

        }

    }

    private static void updateProductStock(Map<Product, Integer> productMap) {

        for (Product product : productMap.keySet()) {


            product.setRemainingStock(product.getRemainingStock() - productMap.get(product));


        }



    }

    private static Discount findDiscountById(String discountId) throws Exception {


        for (Discount discount : StaticConstants.DISCOUNT_LIST) {

            if (discount.getId().toString().equals(discountId)){
                return discount;
            }

        }

        throw new Exception("Discount couldn't applied because couldn't found");
    }

    private static boolean putItemToCartIfStockAvailable(Cart cart, Product product) {

        System.out.println("How many you would like to buy: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();



        // 2 different senerio :

        //1: if in my cart nothing existing yet, check the count with stock

        //2: if in my cart existing product , check cartCount(quantity) + count with the stock


        Integer countInsideTheProductMap = cart.getProductMap().get(product);
        // how many existing product in your cart? +

        //quantity : Integer in the map


        if (countInsideTheProductMap != null && product.getRemainingStock() > count+countInsideTheProductMap){
            cart.getProductMap().put(product, count+countInsideTheProductMap);
            return true;
        }else if (product.getRemainingStock() >= count){
            cart.getProductMap().put(product,count);
            return true;
        }

        return false;
    }

    private static Product findProductById(String productId) throws Exception {

        for (Product product : StaticConstants.PRODUCT_LIST) {

            if (product.getId().toString().equals(productId)){
                return product;
            }

        }


        throw new Exception("Product could not found");


    }

    private static GiftCardBalance findGiftCardBalance(UUID customerId) {

        for (Balance gBalance : StaticConstants.GIFT_CARD_BALANCE_LIST) {


            if (gBalance.getCustomerId().toString().equals(customerId.toString())){
                return (GiftCardBalance) gBalance;
            }

        }

        GiftCardBalance giftCardBalance = new GiftCardBalance(customerId,0d);
        StaticConstants.GIFT_CARD_BALANCE_LIST.add(giftCardBalance);

        return giftCardBalance;

    }

    private static CustomerBalance findCustomerBalance(UUID customerId) {

        for (Balance cBalance : StaticConstants.CUSTOMER_BALANCE_LIST) {

            if (cBalance.getCustomerId().toString().equals(customerId.toString())){

                return (CustomerBalance) cBalance;
            }

        }

        // if it is not found, then

        CustomerBalance customerBalance = new CustomerBalance(customerId,0d);
        StaticConstants.CUSTOMER_BALANCE_LIST.add(customerBalance);

        return customerBalance;
    }



    private static String[] prepareMenuOptions(){

        return new String[]{"List Categories", "List Products", "List Discounts","See Balance","Add Balance","Place an order","See Cart","See order details","See your address","Close App"};

    }






}
