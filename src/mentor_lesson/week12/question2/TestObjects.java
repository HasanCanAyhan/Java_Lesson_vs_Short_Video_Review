package mentor_lesson.week12.question2;

public class TestObjects {

    public static void main(String[] args) {

        Employee employee = new Employee("Can","Schwarzwaldstraße/Bensheim",27,1234443345,2500);
        Manager manager = new Manager("Josh","lA/USA",45,1234443345,4500);

        System.out.println(employee);
        System.out.println(manager);

        employee.printSalary();
        manager.printSalary();



    }

}
