package java_short_video.OOPInheritance_SuperKeyword;

public class Cat extends Animal {


    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    } // subClass

    public void scratch(){
        System.out.println(name + " is scratching");
    }





}
