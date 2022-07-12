package java_short_video.OOP_Polymorphism.PatikaLesson;

class Animal{ // 3 subClass
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void speak(){
        System.out.println("java_short_video.OOP_Polymorphism.patikaLesson.Animal speaks....");
    }

    public static void list(Animal[] animals){
        for (Animal eachAnimal : animals) {
          eachAnimal.speak();
        }
    }

}

class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " is speaking üüüüüüüü");
    }
}


class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " is speaking hav hav ");
    }
}


class Horse extends Animal{

    public Horse(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " is speaking AI AI AI");
    }
}



public class Main {

    public static void speakTry(Animal animal){
        animal.speak();
    }

    public static void main(String[] args) {


        Animal animal = new Animal("java_short_video.OOP_Polymorphism.patikaLesson.Animal");
        Bird bird = new Bird("Lemon");
        Dog dog = new Dog("Lucy");
        Horse horse = new Horse("Black java_short_video.OOP_Polymorphism.patikaLesson.Horse");


        animal.speak();
        bird.speak();
        dog.speak();
        horse.speak();

        System.out.println("--------------------------------------");

        Animal animal1 = new Bird("Lemon");
        animal1.speak(); // Lemon is speaking üüüüüüüü

        Animal animal2 = new Dog("Lucy");
        animal2.speak();// Lucy is speaking hav hav


        System.out.println("------------------------------------");

        speakTry(new Horse("Black java_short_video.OOP_Polymorphism.patikaLesson.Horse")); // Black java_short_video.OOP_Polymorphism.patikaLesson.Horse is speaking AI AI AI
        speakTry(new Bird("Lemon")); // Lemon is speaking üüüüüüüü


        System.out.println("------------------------------------");

        Animal[] animals = {dog,bird,horse};

        Animal.list(animals);

    }

}
