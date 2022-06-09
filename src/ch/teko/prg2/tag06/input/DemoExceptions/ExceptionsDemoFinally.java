package ch.teko.prg2.tag06.input.DemoExceptions;

import java.io.FileWriter;

public class ExceptionsDemoFinally {
    public static void main(String[] args) {

        String data = "This is the data in the output file";

        try {
            // Creates a FileWriter
            FileWriter output = new FileWriter("./src/ch/teko/prg2/tag06/input/DemoExceptions/output.txt");
            //FileWriter output = new FileWriter(".\\src\\ch\\teko\\prg2\\tag06\\input\\DemoExceptions\\output.txt");

            // Writes the string to the file
            output.write(data);

            // Closes the writer
            output.close();
        }

        catch (Exception e) {
            e.printStackTrace();
        }

        finally {
            System.out.println("Ich werde immer ausgeführt, auch bei einer Exception");
        }
    }
}
