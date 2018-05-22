package jrout.tutorial.corejava.inheritance;

public class Animal {
    private String type ; // mammal reptile birds
    private boolean hasTail = false;
    private int legs = 2;
    private boolean isHuman = false;
    private String name;
    private int size;
//    public Animal(){}

    public Animal(String type , boolean isHuman){
        this.type = type;
        this.isHuman = isHuman;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean hasTail(){
        return this.hasTail;
    }

    public void setHuman(boolean isHuman){
        this.isHuman = isHuman;
    }

    public boolean isHuman() {
        return isHuman;
    }




    @Override
    public String toString() {
        return "I am of Type ["+ this.type +"] Is Human = ["+ this.isHuman+"]";
    }
}
