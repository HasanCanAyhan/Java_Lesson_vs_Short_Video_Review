package java_short_video.OOPEncapsulation;

public class Employee {

    private String name;
    private double salary;

    // getter
    public String getName(){
        return name;
    }

    //setter
    public void setName(String name){
        this.name = name; // in order to call instance variable
    }

    // getter
    public double getSalary() {
        return salary;
    }

    //setter
    public void setSalary(double salary) {

        if (salary <= 0){
            System.err.println("Invalid Salary: " + salary);
            System.exit(0);
        }

        this.salary = salary;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
