package hexlet.code;

import java.util.Scanner;
public class Cli {
    public static void greeting() {
        System.out.println("Welcome to the Brain Games! \n"
                + "May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
    }
}
