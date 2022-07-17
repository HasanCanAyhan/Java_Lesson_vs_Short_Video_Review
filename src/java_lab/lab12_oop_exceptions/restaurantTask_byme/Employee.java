package java_lab.lab12_oop_exceptions.restaurantTask_byme;

public abstract class Employee {

    private String name, jobTitle;
    private int age;
    private final char gender;
    private final String id;
    private double salary;

    public Employee(String name, String jobTitle, int age, char gender, String id, double salary) {
        setName(name);
        setJobTitle(jobTitle);
        setAge(age);
        if ( !(gender == 'M' || gender == 'F')){
            throw new NoSuchPersonException("Gender can only be set to 'M' or 'F'");
        }
        this.gender = gender;
        if(id == null || id.isEmpty()){
            throw new IllegalArgumentException("ID can not be null or empty");
        }
        this.id = id;
       setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if(name == null || name.isEmpty()){
            throw new NoSuchPersonException("Name can not be null or empty");
        }

        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if(jobTitle == null || jobTitle.isEmpty()){
            throw new NoSuchJobException("Job title can not be null or empty");
        }

        this.jobTitle = jobTitle;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 0){
            throw new NoSuchPersonException("Age can not be negative: " + age);
        }

        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public String getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary < 0){
            throw new NoSuchJobException("Salary can not be negative: " + salary);
        }

        this.salary = salary;
    }

    // Abstract methods work() // that means : meant to be overridden in sub class
    public abstract void work();

    // you can not write with abstract keyword : static and final X


    public String toString() {
        return   getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", salary= $" + salary +
                '}';
    }
}
/*
3. Create an abstract class named Employee

			variables:
				name, age, gender(final), id, jobTitle, salary

			Encapsulate all the fields:
				Conditions:
					1. name can not be null or empty, otherwise throw a NoSuchAPersonException

					2. age can not be negative, otherwise throw a NoSuchAPersonException

					3. gender can only be set to 'M' or 'F', otherwise throw a NoSuchAPersonException

					4. jobTitle can not be null or empty, otherwise throw a NoSuchAJobException

					5. salary can not be negative, otherwise throw a NoSuchAJobException

					5. id can not be set to null or empty, otherwise throw an illigalArgumentException

			Add a constructor that can set all the fields

			Abstract methods:
				work();

			Non-Abstract method:
				toString()
 */