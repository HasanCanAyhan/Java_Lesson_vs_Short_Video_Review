package java_lab.lab09_Encapsulate;

public class MyScrumTeam {

    public static void main(String[] args) {

        Tester[] testers = { new Tester("Can","A123","Java Developer",27,'M',8) };

        Developer[] developers = { new Developer("Josh","A124","Full Stack","Java",29,'M',8)};

        ScrumTeam scrumTeam1 = new ScrumTeam("Muhtar","Ozzy","Kuzzat",7);


        scrumTeam1.addTester(testers);
        scrumTeam1.addDeveloper(developers);

        System.out.println(scrumTeam1);



        for (Developer developer : scrumTeam1.getDevelopers()) {

            System.out.println(developer.getName());
        }

        for (Tester tester : scrumTeam1.getTesters()) {

            System.out.println(tester.getName());
        }




    }


}
