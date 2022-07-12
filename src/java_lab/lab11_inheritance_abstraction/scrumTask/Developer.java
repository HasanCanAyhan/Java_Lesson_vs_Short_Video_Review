package java_lab.lab11_inheritance_abstraction.scrumTask;

public class Developer extends Employee implements ScrumMember,WFH{

    public Developer(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is coding");
    }

    public void fixBug(){ // unique method
        System.out.println(getName() + " is fixing the bug");
    } // unique method


    @Override
    public void dailyStandUp() {

    }

    @Override
    public void sprintPlanning() {

    }

    @Override
    public void workFromHome() {

    }
}
