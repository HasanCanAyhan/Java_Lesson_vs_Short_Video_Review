package java_short_video.OOPInheritance_SuperKeyword;

public class Dog extends Animal { // subClass

    public void bark(){
        System.out.println(name + " is barking");
    }

    public Dog(String name, String breed, char gender, int age, String size, String color){
        super(name, breed, gender, age, size, color); // call parent class constructor
    }




}
