package jrout.tutorial.corejava.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("/Users/jrout/Development/Github/batch27/CoreJava/src/jrout/tutorial/corejava/exceptionhandling/MyOwnException.java");
        System.out.println(file.isFile());

        File directory = new File("/Users/jrout/Development/Github/batch27/CoreJava/src/jrout/tutorial/corejava/concepts");
        System.out.println(directory.isDirectory());

        File toDelete = new File("/Users/jrout/Development/Github/batch27/CoreJava/src/jrout/tutorial/corejava/exceptionhandling/test.txt");
        System.out.println(toDelete.delete());
//        Scanner scanner = null;

        /*try {
            scanner = new Scanner(file);
            while(scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(scanner != null) {
                scanner.close();
            }
        }*/
        /*
            Try with resources...
         */
        /*try(Scanner scanner = new Scanner(file)){
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/


        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        }

//        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(new File("")));

        // Use a delimiter to separate the words...


    }
}
