package java_short_video.custom_class.instanceVariables_InstanceMethods;

public class Dog {

    // Instance variable : multiply copy ,    Syntax : public DataType  variable
    public String name;
    public String breed;

    public char gender;
    public String size;
    public int age;
    public String color;



    // Instance  Methods

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void drink(){
        System.out.println(name+" is drinking");
    }

    public void play(){
        System.out.println(name+" is playing");
    }


    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
