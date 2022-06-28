package java_short_video.OOPEncapsulation;

public class EmployeeObject {

    public static void main(String[] args) {


        Employee employee1 = new Employee();
        //employee1.name = "Josh";
        //employee1.salary = 12000;

        employee1.setName("Josh");
        employee1.setSalary(-120000);


        System.out.println(employee1.getName());
        System.out.println(employee1.getSalary());


    }

}
