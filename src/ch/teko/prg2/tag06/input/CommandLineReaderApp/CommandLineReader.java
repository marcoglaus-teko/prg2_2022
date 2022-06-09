package ch.teko.prg2.tag06.input.CommandLineReaderApp;

import java.util.Scanner;

public class CommandLineReader implements ICommandLineReader {
    private Scanner scanner;

    public CommandLineReader() {
        this.scanner = new Scanner(System.in);
    }

    public void close(){
        this.scanner.close();
    }

    @Override
    public String readStringFromCommandLine() {
        return this.scanner.nextLine();
    }

    @Override
    public int readDigitFromCommandLine() {
        System.out.println("Enter Digit: ");
        return this.scanner.nextInt();
    }
}
