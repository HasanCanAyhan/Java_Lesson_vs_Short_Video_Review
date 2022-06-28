package java_lab.lab09_Encapsulate;

public class Tester {


    private String name , jobTitle;

    public String employeeID;
    private int age;
    private char gender;
    private int hourlyRate;


    public String getName() {
        return name;
    }

    public void setName(String name) {

        if(name == null || name.isEmpty() || name.isBlank()){
            System.err.println("name can not be null , empty or blank: " + name );
            System.exit(1);
        }

        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {

        if(jobTitle == null || jobTitle.isEmpty() || jobTitle.isBlank()){
            System.err.println("name can not be null , empty or blank: " + jobTitle );
            System.exit(1);
        }

        this.jobTitle = jobTitle;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if(age < 18){
            System.err.println("age can not be less than 18: " +age);
            System.exit(1);
        }

        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        if (! (gender == 'M' || gender == 'F')){
            System.err.println("gender can only be set to 'M or 'F: " + gender);
            System.exit(1);
        }
        this.gender = gender;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {

        if(hourlyRate < 0){
            System.err.println("hourlyRate can not be negative: " + hourlyRate);
            System.exit(1);
        }

        this.hourlyRate = hourlyRate;
    }


    // Constructor
    public Tester(String name, String employeeID, String jobTitle, int age, char gender, int hourlyRate) {
        setName(name);
        this.employeeID = employeeID;
        setJobTitle(jobTitle);
        setAge(age);
        setGender(gender);
        setHourlyRate(hourlyRate);
    }

    public double getSalary(){
        return hourlyRate * 365;
    }

    public void testing(){
        System.out.println(name + " is testing");
    }

    public String toString() {
        return "Tester{" +
                "name='" + getName() + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", hourlyRate=" + getHourlyRate() +
                ", annual salary =" + getSalary() +
                '}';
    }
}
/*
Scrum Task:
    1. create a class named Tester
            Variables:
                name, age, gender, employeeID, jobTitle, hourlyRate

            Encapsulate all the fields
                Conditions for setting the fields:
                    1. name can not be set to null/empty/blank
                    2. age can not be less than 18
                    3. gender can only be set to 'M' or 'F'
                    5. jobTitle can not be set to null/empty/blank
                    6. hourlyRate can not be negative

            Add a condtsrutcor that can set all the fields when an object is created

            Methods:
                getSalary(): returns the annual salary
                testing()
                toString()


    2. create a class named Developer
            Attributes:
                name, age, gender, employeeID, jobTitle, hourlyRate , programmingLanguage

            Encapsulate all the fields
              Conditions for setting the fields:
                  1. name can not be set to null/empty/blank
                  2. age can not be less than 18
                  3. gender can only be set to 'M' or 'F'
                  5. jobTitle can not be set to null/empty/blank
                  6. hourlyRate  can not be negative
                  7. programmingLanguage must be one of those programming language:
                          languages = {"Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"}
            Method:
              getSalary(): returns the annual salary
              coding()
              fixingBug()
              toString()


    3. create a class called ScrumTeam
            Attributes:
                PO (String), BA (String), SM (String)
                testers (ArrayList<Tester>)
                developers(ArrayList<Developer>)
                daysOfSprint (int)

            Encapsulate the fields PO, BA, SM and daysOfSprint
                Conditions:
                  PO, BA, SM can not be null/empty/blank
                  days of sprint can not be 0 or negative

            Encapsulate tester and developers but ONLY generate getters
                (we do not set them by setters we will use add and remove functions instead)

            Add a constructor that can set the names of PO, BA and SM

            Methods:
                addTester(Tester tester): adds the given tester to the testers ArrayList

                addTester(Tester[] testers): adds the given testers to the testers ArrayList

                addDeveloper(Developer developer): adds the given developer to the developers ArrayList

                addDeveloper(Developer[] developers): adds the given developers to the developers ArrayList

                removeTester(long employeeID): removes the given tester from the testers ArrayList

                removeDeveloper(long employeeID): removes the developer from the developers ArrayList

                toString(): prints PO name, SM name, BA name, number of tester, and number of developers


    4. create a class called MyScrumTeam:
            1. create an array of Testers
            2. create an array of developers
            3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */