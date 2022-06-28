package java_short_video.custom_class1;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;


    // set the Constructors
    public Employee(String name, char gender, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
