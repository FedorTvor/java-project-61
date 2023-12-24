package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "0 - Exit");
        var choise = scanner.next();
        System.out.println("Your choice: " + choise);
        if (choise.equals("1")) {
            greeting();
            String name = scanner.next();
            System.out.println("Hello, " + name + "!");
        } else if (choise.equals("2")) {
            greeting();
            String name = scanner.next();
            System.out.println("Hello, " + name + "!");
            GameLogic.evenNumber(name);
        } else {
            System.out.println("bye bye");
        }
    }
    public static void greeting() {
        System.out.println("Welcome to the Brain Games! \n"
                + "May I have your name?");
    }
}

