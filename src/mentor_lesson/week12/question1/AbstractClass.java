package mentor_lesson.week12.question1;

public abstract class AbstractClass {


    AbstractClass(){
        System.out.println("This is constructor of abstract class");
    }

    public abstract void a_method();

    public void non_abstract(){
        System.out.println("This is a normal method of abstract class");
    }



}
