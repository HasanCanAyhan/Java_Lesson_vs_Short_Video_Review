package java_lab.lab11_inheritance_abstraction.scrumTask;

public abstract class Employee extends Person{ // we can not create any object from it
    // we can say interface class, because in interface we can not have instance variable/methods,constructor etc...
    // if we say final class, then final class can not be inherited .

    private final String id;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender);
        this.id = id;
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work(); // abstract method must be inside the either Abstract class or in Interface
    // This method is common method for all the sub-child classes!!!
    // we can not say  public final abstract void work() method , final does not  allow to be overridden,  abstract method must be overridden , we can not use final here!!!

    @Override
    public String toString() {
        return super.toString().replace("}","") +
                ", id=" + id +
                ", jobTitle=" + jobTitle +
                ", salary= $" + salary +
                '}';
    }


}
/*
2. Create the subclass of Person named Employee
			Extra variables:
				id-final, jobTitle, salary

			extra methods:
				work() (abstract)

			override the toString to include id, jobTitle, salary
 */