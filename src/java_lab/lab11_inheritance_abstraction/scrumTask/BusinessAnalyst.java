package java_lab.lab11_inheritance_abstraction.scrumTask;

public final class BusinessAnalyst extends Employee implements ScrumMember,WFH{
//


    public BusinessAnalyst(String name, int age, char gender, String id,double salary) {
        super(name, age, gender, id, "Business Analyst", salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " gathering requirement documents");
    }

    public void analyze(){ // unique method
        System.out.println(getName() + " is analyzing requirements ");
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
