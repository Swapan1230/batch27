package jrout.tutorial.corejava.io;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String place;
    private String profession;
    private transient int ssn;
    private String gender;
    private int height;

    private static final long serialVersionUID = -2321414141431L;

    public Person(){}
    public Person(String n, String pr, String place) {
        name = n; profession = pr; this.place = place;
    }
    public Person(String n, String pr, String place, int ssn) {
        name = n; profession = pr; this.place = place;
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
