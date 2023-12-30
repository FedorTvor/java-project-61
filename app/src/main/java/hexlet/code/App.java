package hexlet.code;

import hexlet.code.games.EvenNumber;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");
        var choise = scanner.next();
        System.out.println("Your choice: " + choise);
        if (choise.equals("1")) {
            Engine.greeting();
        } else if (choise.equals("2")) {
            Engine.greeting();
            EvenNumber.evenNumber();
        } else if (choise.equals("3")) {
            Engine.greeting();
            Calc.calc();
        } else if (choise.equals("4")) {
            Engine.greeting();
            Gcd.greatestCommonDivisor();
        } else if (choise.equals("5")) {
            Engine.greeting();
            Progression.progression();
        } else if (choise.equals("6")) {
            Engine.greeting();
            Prime.prime();
        } else if (choise.equals("0")) {
            System.out.println("Exit");
        }
    }
}

