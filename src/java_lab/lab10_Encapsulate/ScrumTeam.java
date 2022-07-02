package java_lab.lab10_Encapsulate;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    private String PO, BA , SM;

    private int daysOfSprint;

    private ArrayList<Tester> testers = new ArrayList<>();

    private ArrayList<Developer> developers = new ArrayList<>();


    public String getPO() {
        return PO;
    }

    public void setPO(String PO) {

        if(PO == null || PO.isEmpty() || PO.isBlank()){
            System.err.println("name can not be null , empty or blank: " + PO );
            System.exit(1);
        }

        this.PO = PO;
    }

    public String getBA() {
        return BA;
    }

    public void setBA(String BA) {

        if(BA == null || BA.isEmpty() || BA.isBlank()){
            System.err.println("name can not be null , empty or blank: " + BA );
            System.exit(1);
        }


        this.BA = BA;
    }

    public String getSM() {
        return SM;
    }

    public void setSM(String SM) {

        if(SM == null || SM.isEmpty() || SM.isBlank()){
            System.err.println("name can not be null , empty or blank: " + SM );
            System.exit(1);
        }

        this.SM = SM;
    }

    public int getDaysOfSprint() {
        return daysOfSprint;
    }

    public void setDaysOfSprint(int daysOfSprint) {
        if (daysOfSprint == 0 || daysOfSprint < 0){
            System.err.println(" days of sprint can not be 0 or negative: " + daysOfSprint);
            System.exit(1);
        }

        this.daysOfSprint = daysOfSprint;
    }


    public ArrayList<Tester> getTesters() {
        return testers;
    }

    public ArrayList<Developer> getDevelopers() {
        return developers;
    }

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        setPO(PO);
        setBA(BA);
        setSM(SM);
        setDaysOfSprint(daysOfSprint);
    }

    public void addTester(Tester tester){
        testers.add(tester);
    }

    public void addTester(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addDeveloper(Developer[] developers){
        this.developers.addAll(Arrays.asList(developers));
    }

    public void  removeTester(long employeeID){
        testers.removeIf(p -> p.employeeID.equals(employeeID) );
    }
    public void  removeDeveloper(long employeeID){
        developers.removeIf(p -> p.employeeID.equals(employeeID) );
    }


    public String toString() {
        return "ScrumTeam{" +
                "PO='" + getPO() + '\'' +
                ", BA='" +getBA() + '\'' +
                ", SM='" + getSM() + '\'' +
                ", number of tester='" + testers.size() + '\'' +
                ", number of developers='" + developers.size() + '\'' +
                '}';
    }

}
