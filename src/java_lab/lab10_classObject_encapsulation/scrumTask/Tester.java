package java_lab.lab10_classObject_encapsulation.scrumTask;

public class Tester {

    private String name;
    private int age;
    private char gender;
    private String id;
    private String jobTitle;
    private double hourlyRate;


    public String getName(){
        return name;
    }

    public void setName(String name){

        if (name == null || name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name: " + name);
            System.exit(1);
        }

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 18){
            System.err.println("Invalid age for the tester: " +age);
            System.exit(1);
        }

        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        if (  !(gender == 'M' || gender == 'F')  ){ // invalid
            System.err.println("Invalid gender for tester: " +gender);
            System.exit(1);
        }

        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {

        if (jobTitle == null || jobTitle.isEmpty() || jobTitle.isBlank()){  // jobTitle.trim().isEmpty()
            System.err.println("Invalid jobTitle: " + jobTitle);
            System.exit(1);
        }

        this.jobTitle = jobTitle;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {

        if (hourlyRate < 0){
            System.err.println("Hourly rate of the tester can not be negative: " + hourlyRate);
            System.exit(1);
        }

        this.hourlyRate = hourlyRate;
    }


    // Constructor
    public Tester(String name, int age, char gender, String id, String jobTitle, double hourlyRate) {
        setName(name);
        setAge(age);
        setGender(gender);
        setId(id);// there is no condition, but if there would be new requirement in the future,because of that we should write set method
        setJobTitle(jobTitle);
        setHourlyRate(hourlyRate);
    }


    public double getSalary(){
        return hourlyRate * 40 * 52;
    }

    public void testing(){
        System.out.println(name + " is testing the application");
    }


    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + getSalary() +
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

            Add a constructor that can set all the fields when an object is created

            Methods:
                getSalary(): returns the annual salary
                testing()
                toString()
 */