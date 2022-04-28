package ch.teko.prg2.tag01.input.reptition.demoInport;

// import der Klasse Scanner aus dem Package java.util des JDKs
import java.util.Scanner;

public class ConsoleReader {
    public static void main(String[] args) {
        // Testen der Klasse Scanner
        Scanner myObj = new Scanner(System.in);
        System.out.println("\nEnter username: ");
        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
    }
}
