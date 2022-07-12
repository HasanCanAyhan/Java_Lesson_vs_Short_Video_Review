package java_lab.lab11_inheritance_abstraction.scrumTask;

public final class ScrumMaster extends Employee implements ScrumMember,WFH{

    public ScrumMaster(String name, int age, char gender, String id, double salary) {
        super(name, age, gender, id, "Scrum Master", salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is schedule meetings");
    }



    public void coaching(){  // unique method
        System.out.println(getName() + "is coaching");
    }


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
