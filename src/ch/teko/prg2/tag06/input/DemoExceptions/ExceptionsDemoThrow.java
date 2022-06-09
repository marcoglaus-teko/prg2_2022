package ch.teko.prg2.tag06.input.DemoExceptions;

import java.util.Scanner;

public class ExceptionsDemoThrow {
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter username --> ");

        String userName = myObj.nextLine();  // Read user input

        if (!userName.equals("admin"))
            throw new IllegalArgumentException("wrong user");

        System.out.println("Username: " + userName + " is logged in.");  // Output user input

    }
}
