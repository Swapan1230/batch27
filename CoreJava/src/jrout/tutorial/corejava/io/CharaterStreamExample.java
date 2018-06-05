package jrout.tutorial.corejava.io;
import java.io.*;

public class CharaterStreamExample {
    private static String inputFile = "/Users/jrout/Development/Github/batch27/Assignment/Assignment.txt";
    private static String outputFile = "/Users/jrout/Development/Github/batch27/CoreJava/src/jrout/tutorial/corejava/io/Assignment.txt";

    public static void main(String args[]) throws IOException {
        charStreamDirect();
//        charStreamUsingBuffer();
    }

    private static void charStreamDirect() throws IOException {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader(inputFile);
            fileWriter = new FileWriter(outputFile);
            int c;
            while ((c = fileReader.read()) != -1) {
                /*
                 * If you want to print the output in the console then use (char)c) i.e. casting the int back to char
                 */
				System.out.print((char)c);
                fileWriter.write(c);
            }
            System.out.println("Written Succesfully");
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
    }

    /**
     * Using BufferedReader
     * @throws IOException
     */
    private static void charStreamUsingBuffer() throws IOException {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        int c;
        try {
            fileReader = new FileReader(
                    "C:\\Users\\Jayram\\git\\trunk\\CoreJava\\src\\jrout\\tutorial\\corejava\\io\\Person.java");
            bufferedReader = new BufferedReader(fileReader);

            fileWriter = new FileWriter(
                    "C:/Users/Jayram/git/trunk/CoreJava/src/jrout/tutorial/corejava/io/PersonTemp.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            while ((c = bufferedReader.read()) != -1) {
                bufferedWriter.write(c);
            }
            System.out.println("Written Succesfully");
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
    }
}
