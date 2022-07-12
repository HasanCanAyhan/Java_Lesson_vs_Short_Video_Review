package mentor_lesson.week12.question2;

public class Member {

    private String name, address;
    private int age;
    private long phoneNumber;
    private double salary;


    public Member(String name, String address, int age, long phoneNumber, double salary) {
        setName(name);
        setAddress(address);
        setAge(age);
        setPhoneNumber(phoneNumber);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printSalary(){
        System.out.println(salary);
    }



    public String toString() {
        return   getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", salary=" + salary +
                '}';
    }
}
