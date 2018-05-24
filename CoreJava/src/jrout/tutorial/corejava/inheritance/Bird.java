package jrout.tutorial.corejava.inheritance;

public class Bird extends Animal {

    private int wingSize = 1; // in feet
    private String beakShape; // curved or straight
    private boolean walks;
    private String featherColor;
    private boolean canFly;

    public Bird(String type, String name){
        super(type, false);
        super.setName(name);
    }

    public int getWingSize() {
        return wingSize;
    }

    public void setWingSize(int wingSize) {
        this.wingSize = wingSize;
    }

    public String getBeakShape() {
        return beakShape;
    }

    public void setBeakShape(String beakShape) {
        this.beakShape = beakShape;
    }

    public boolean isWalks() {
        return walks;
    }

    public void setWalks(boolean walks) {
        this.walks = walks;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public void makeNoise(){
        System.out.println( getType() + " I am making some chirping.........");
    }
}
