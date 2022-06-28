package java_short_video.OOPInheritance_SuperKeyword;

public class Zoo {


    public static void main(String[] args) {

        /*
        Dog dog = new Dog();
        dog.name = "Lucy";
        dog.breed = "Husky";
        dog.gender = 'F';
        dog.age = 4;
        dog.size = "Large";
        dog.color = "White";

        dog.bark();
        dog.sleep();

        System.out.println(dog);

        System.out.println("-----------------------");

        Cat cat = new Cat();
        cat.name = "Jermy";
        cat.breed = "Ragdoll";
        cat.gender = 'M';
        cat.age = 5;
        cat.size = "Small";
        cat.color = "Gray";

        cat.sleep();
        cat.scratch();


        System.out.println(cat);


        System.out.println("---------------------------------------------------");

        Fish fish = new Fish();
        fish.name = "Nemo";
        fish.breed = "Clownfish";
        fish.gender = 'M';
        fish.age = 2;
        fish.size = "Small";
        fish.color = "Orange";

        fish.sleep();
        fish.swim();

        System.out.println(fish);

         */


        Dog dog = new Dog("Lucy","Husky",'F',3,"Large","White");

        System.out.println(dog);

        Cat cat = new Cat("Jermy","Ragdoll",'M',4,"Small","Black");

        System.out.println(cat);

        Fish fish = new Fish("Nemo","Clownfish",'M',2,"Small","Orange");

        System.out.println(fish);

    }

}
