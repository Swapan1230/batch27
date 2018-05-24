package jrout.tutorial.corejava.inheritance.abstractexample;

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

    public void companyName() {
        System.out.println("I belong to H2kInfosys...");
    }

    // Software || Infrastructure || Database


    public abstract void natureOfWork();

}
