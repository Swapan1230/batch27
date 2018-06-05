package jrout.tutorial.corejava.io;

import java.io.*;

public class WriteToExistingFile {
    public static void main(String[] args) {
//        appendTextToFile();
//        appendTextToFileWithoutFinally();
        writeContentToFile();
    }

    private static void appendTextToFile() {
        PrintWriter out = null;
        try {
            /**
             * The second parameter to the FileWriter constructor will tell it
             * to append to the file (as opposed to clearing the file)
             */
            out = new PrintWriter(new BufferedWriter(new FileWriter(
                    "ExistingFile.txt", true)));
            out.println("the text");
            out.println("the text");
            out.println("the text");
            out.println("the text");
            out.println("the text");
            out.println("the text");
            out.println("the text");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }

    /**
     * try-with-resource statement : jdk 1.7
     * No finally block is required for closing the
     * declared resource(s) because it is handled automatically,
     */
    private static void appendTextToFileWithoutFinally() {

        try (PrintWriter out = new PrintWriter(new BufferedWriter(
                new FileWriter("ExistingFile.txt", true)))) {
            out.println("the text");
        } catch (IOException e) {
            System.err.println(e);
        }
    }


    static File file = new File("Student.txt");

    /**
     * Write some content to the file
     *
     * @throws IOException
     */
    private static void writeContentToFile() {
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
            fw.write("Good Morning\nfolks\n How u doing...I am going to write again..");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void readContentFromFile() throws IOException {
        char[] in = new char[100];
        FileReader fr = null;
        int size;
        fr = new FileReader(file);
        size = fr.read(in); // read the content of file into the char array
        System.out.println(size + " "); // how many bytes read

        for (char c : in)
            System.out.print(c);

        if(fr != null){
            try{
                fr.close();
            }catch(Exception exp){}
        }
    }
}
