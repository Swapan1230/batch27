package jrout.tutorial.corejava.inheritance.abstractexample;
import java.lang.Object;

public abstract class ITEngineer {
    private String name;
    private int empId;

    public String getDepartment() {
        return department;
    }

    private String department;

    public ITEngineer(String name, int empId, String department) {
        this.name = name;
        this.empId = empId;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    final public void companyName() {
        System.out.println("I belong to H2kInfosys...");
    }

    // Software || Infrastructure || Database


    public abstract void natureOfWork();

}
