package jrout.tutorial.corejava.concepts;

import jrout.tutorial.corejava.pojo.Person;

public class GarbageCollection {
    public static void main(String[] args) {
        /*Person p1 = new Person("Raja");
        Person p2 = new Person();
        Person p3 = new Person();

        //........
        System.out.println(p2.getName());
        System.out.println(p3.getName());
        GarbageCollection gc = new GarbageCollection();
        gc.printDetail(p3);

        Person p100 = new Person(); //


        System.out.println(p1.getName());
*/
        for(int i =0 ; i < 1000000; i++){
            new Person("Name"+i);
        }

        PageHit pageHit = new PageHit("Rahul");
    }

    public void printDetail(Person per){
        System.out.println(per.getName());
    }



}
