package hexlet.code;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "0 - Exit");
        var choise = scanner.next();
        System.out.println("Your choice: " + choise);
        if (choise.equals("1")) {
            Engine.greeting();
        } else if (choise.equals("2")) {
            Engine.greeting();
            GameLogic.evenNumber(Player.getName());
        } else if (choise.equals("3")) {
            Engine.greeting();
            GameLogic.calc(Player.getName());
        } else {
            System.out.println("bye bye");
        }
    }


}

