package jrout.tutorial.corejava.pojo;


import jrout.tutorial.corejava.pojo.Address;

public class Student {
    private String name;
    private int age;
    private String courseTaken[];

    Address address;

    public void setAge(int ageX) {
        if(ageX < 18) {
            age  = 18;
        }else {
            age  = ageX;
        }
    }

    public int getAge(){
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCourseTaken() {
        return courseTaken;
    }

    public void setCourseTaken(String[] courseTaken) {
        this.courseTaken = courseTaken;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
