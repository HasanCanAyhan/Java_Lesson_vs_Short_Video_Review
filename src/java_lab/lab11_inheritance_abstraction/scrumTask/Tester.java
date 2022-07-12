package java_lab.lab11_inheritance_abstraction.scrumTask;

public final class Tester extends Employee  implements ScrumMember,WFH{// we can not give abstract because we want to create object from it


    public Tester(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }
    @Override
    public void work() {
        System.out.println(getName() + " is testing the application");
    }

    public void createTicket(){  // unique method
        System.out.println(getName() + " is creating ticket");
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
/*
	3. Create the following sub classes of the Employee:
			1. Tester
					extra methods:
						createTicket(), -->> unique method
						dailyStandUp(), workFromHome()

			2. Developer
					extra methods:
						fixBug(),  -->> unique method
						dailyStandUp(), workFromHome()

			3. BusinessAnalyst
					extra methods:
						analyze(),  -->> unique method
						dailyStandUp(), workFromHome()

			4. ScrumMaster:
					extra methods:
						coaching(),  -->> unique method
						dailyStandUp(), workFromHome()

			5. Teacehr:
					extra methods:
						teach(), -->> unique method
						 workFromHome()

			6. Driver:
					extra methods:
						drive()  -->> unique method

			7. Janitor:

	4. ScrumTeam


	interface ScrumMember
			dailyStandUp(); for Tester, Developer, BusinessANALIYST,ScrumMater

	interface WFH:
			workFromHome(); for Tester,Developer,Business Analiyst,Scrum Master,Teacher
 */
