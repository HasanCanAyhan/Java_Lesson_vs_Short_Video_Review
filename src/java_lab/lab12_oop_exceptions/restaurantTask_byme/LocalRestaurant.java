package java_lab.lab12_oop_exceptions.restaurantTask_byme;

public class LocalRestaurant {

    public static void main(String[] args) {

        Employee employee1 = new Server("Can","Server",32,'M',"A1",85000);

        Employee employee2 = new Chef("Aras","Head Chef",28,'M',"A2",88000);

        employee1.work();
        ((Server)employee1).cleanTable();
        ((Server)employee1).takeOrder();

        System.out.println("----------------------------------------");

        employee2.work();
        ( (Chef)employee2).makeOrder();
        ( (Chef)employee2).washDishes();

        System.out.println("----------------------------------------");

        Restaurant localRest = new Restaurant("Nusret","Germany",4.5);

        localRest.hireServer((Server) employee1); //  ArrayList<Server> servers;
        localRest.hireChef(( (Chef)employee2)); //  ArrayList<Chef> chefs;


        //localRest.terminateChef("A2");

        /* promoteToChef

        Chef newChef = ((Server) employee1).prometedToChef();
        localRest.hireChef(newChef);
        System.out.println("newChef = " + newChef);


         */

        System.out.println(localRest);

        for (Chef eachChef : localRest.getChefs()) {
            System.out.println(eachChef.getName());
        }

        for (Server eachServer : localRest.getServers()) {
            System.out.println(eachServer.getName());
        }




    }


}
