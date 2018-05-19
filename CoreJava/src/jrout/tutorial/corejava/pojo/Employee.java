package jrout.tutorial.corejava.pojo;

public class Employee {

    private String name;
    private int id;
    private String department;
    private String time;
    private Address address;

    /*public Employee(){
        System.out.println("This is a constructor...");
    }*/

    /*
        parameterized constructor....
     */
    public Employee(String name){
        this.name = name;
    }

    public Employee(String nameX, int idX){
        this(nameX);
        id = idX;
    }

    public Employee(String nameX, int idX , String deptX){
//        name = nameX;
//        id = idX;
        this(nameX,idX);
        department = deptX;
    }

    public Employee(String nameX, int idX , String dept, String time){
        this(nameX,idX,dept);
        this.time = time;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    /**
     *
     * @param
     */
    public void printEmpDetail(){
        if(this.name != null) {
            System.out.println(" Employee Name is : "+this.name);
        }

        if(this.id > 0) {
            System.out.println(" Employee ID is : "+this.getId());
        }
        if (this.getDepartment() != null) {
            System.out.println(" Employee Department is : "+this.department);
        }
        System.out.println(System.lineSeparator());
    }


    public String toString() {
        if(this.name != null) {
            System.out.println(" Employee Name is : "+this.name);
        }

        if(this.id > 0) {
            System.out.println(" Employee ID is : "+this.getId());
        }
        if (this.getDepartment() != null) {
            System.out.println(" Employee Department is : "+this.department);
        }
        System.out.println(System.lineSeparator());

       return "";
    }
}
