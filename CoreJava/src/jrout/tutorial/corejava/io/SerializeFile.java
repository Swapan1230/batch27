package jrout.tutorial.corejava.io;

import java.io.*;

public class SerializeFile {
    public static void main(String[] args) throws IOException, ClassCastException, ClassNotFoundException {
        /*Person per = new Person("Jayram","SOFTWARE","New York", 12345);
        FileOutputStream fileOutputStream = new FileOutputStream("jayram1.dat");
        ObjectOutputStream output = new ObjectOutputStream(fileOutputStream);
        output.writeObject(per);
        output.close();
        System.out.println("Object has been written successfully...");*/



        ObjectInputStream input = new ObjectInputStream(new FileInputStream("jayram1.dat"));
        Person perObj = (Person)input.readObject();
        System.out.println(perObj.getName());
        System.out.println(perObj.getPlace());
        System.out.println(perObj.getProfession());
        System.out.println(perObj.getSsn());
        System.out.println(perObj.getGender());


    }



}
