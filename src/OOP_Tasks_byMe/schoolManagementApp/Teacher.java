package OOP_Tasks_byMe.schoolManagementApp;

/*
 * This class is responsible for keeping the track
 * of teacher's name, id, salary.
 */

public class Teacher {

    private int id;
    private String name;
    private double salary;

    private int salaryEarned;

    public Teacher(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /*
     * return the id of the teacher.
     */
    public int getId() {
        return id;
    }

    /*
     * return the name of the teacher.
     */
    public String getName() {
        return name;
    }

    /*
     * return the salary of the teacher.
     */
    public double getSalary() {
        return salary;
    }

    /*
     * set the salary.
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }



    public void receiveSalary(double salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Name of the Teacher: " + name
                +" Total salary earned so far $"
                + salaryEarned;
    }


}
