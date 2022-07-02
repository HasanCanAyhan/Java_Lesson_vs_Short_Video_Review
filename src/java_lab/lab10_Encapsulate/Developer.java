package java_lab.lab10_Encapsulate;

public class Developer {

    private String name, jobTitle,programmingLanguage;
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

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if(! ( programmingLanguage.equalsIgnoreCase("Java") || programmingLanguage.equalsIgnoreCase("JavaScript") ||
                programmingLanguage.equalsIgnoreCase("Python") || programmingLanguage.equalsIgnoreCase("Ruby") || programmingLanguage.equalsIgnoreCase("C#") ||
                programmingLanguage.equalsIgnoreCase("C++") || programmingLanguage.equalsIgnoreCase("Swift"))){

            System.err.println("programmingLanguage must be one of those programming language:");
            System.err.println("languages = {\"Java\", \"JavaScript\", \"Python\", \"Ruby\", \"C#\", \"C++\", \"Swift\"}");
            System.exit(1);

        }

        this.programmingLanguage = programmingLanguage;
    }

    public Developer(String name, String employeeID, String jobTitle, String programmingLanguage, int age, char gender, int hourlyRate) {
        setName(name);
        this.employeeID = employeeID;
        setJobTitle(jobTitle);
        setProgrammingLanguage(programmingLanguage);
        setAge(age);
        setGender(gender);
        setHourlyRate(hourlyRate);
    }

    public double getSalary(){
        return hourlyRate * 365;
    }

    public void coding(){
        System.out.println(name + " is coding");
    }

    public void fixingBug(){
        System.out.println(name + " is fixing Bug");
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", hourlyRate=" + hourlyRate +
                ", annual salary =" + getSalary() +
                '}';
    }
}
