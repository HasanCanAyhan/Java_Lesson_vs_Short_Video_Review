package OOP_Tasks_byMe.schoolManagementApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher(1,"Lizzy",500);
        Teacher teacher2 = new Teacher(2,"Melisa",700);
        Teacher teacher3 = new Teacher(3,"Vanderhorn",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);


        Student student1 = new Student(1,"Tamasha",4);
        Student student2 = new Student(2,"Rakshith",12);
        Student student3 = new Student(3,"Rabbi",5);

        List<Student> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(student1,student2,student3));


        School ghs = new School(teacherList,studentList);

        student1.payFees(5000);
        student2.payFees(6000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned() );

        System.out.println("-------------------Making School pay salary--------------------------------");

        teacher1.receiveSalary(teacher1.getSalary());
        System.out.println("GHS HAS SPENT FOR SALARY TO " + teacher1.getName() + " and now has $" + ghs.getTotalMoneyEarned() );

        teacher3.receiveSalary(teacher3.getSalary());
        System.out.println("GHS HAS SPENT FOR SALARY TO " + teacher3.getName() + " and now has $" + ghs.getTotalMoneyEarned() );

        System.out.println(student2);

        System.out.println(teacher1);

    }


}
