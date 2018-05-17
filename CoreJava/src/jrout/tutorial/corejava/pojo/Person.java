package jrout.tutorial.corejava.pojo;

public class Person {
    private String name;
    private String type; // Father // Husband // Child //
    private String gender; // male  female

    Person father;
    Person mother;
    Person siblings[];

    Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person[] getSiblings() {
        return siblings;
    }

    public void setSiblings(Person[] siblings) {
        this.siblings = siblings;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
