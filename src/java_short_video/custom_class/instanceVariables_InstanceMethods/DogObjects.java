package java_short_video.custom_class.instanceVariables_InstanceMethods;

public class DogObjects {

    public static void main(String[] args) {


        Dog dog1 = new Dog(); // first Object
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.size = "Large";
        dog1.age = 5;
        dog1.color = "White";
        dog1.gender ='F';


        Dog dog2 = new Dog();// second Object
        dog2.name = "Max";
        dog2.breed = "German Shepherd";
        dog2.size = "Small";
        dog2.age =1;
        dog2.color = "Black";
        dog2.gender = 'M';


        System.out.println(dog1);
        System.out.println(dog2);

       dog1.eat();
       dog2.play();



    }

}
