package jrout.tutorial.corejava.concepts;

class PageHit {
    String name;
    static int count = 0;

    public PageHit(String name) {
        count++;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }


}

public class JavaVariables {

    public static void main(String[] args) {
        int count = 0;
        PageHit pageHitOne = new PageHit("Tom"); count++;
        PageHit pageHitTwo = new PageHit("Jerry"); count++;

        for(int i = 0 ; i < 5 ; i++) {
            count++;
            new PageHit("HitPerson"+i);
        }

        System.out.println("Total PageHits are "+ PageHit.count);

    }
}
