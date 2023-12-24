package hexlet.code;

import java.util.Scanner;
public class GameLogic {
    public static void evenNumber(String name) {
        Scanner scanner = new Scanner(System.in);
        for (var count = 0; count <= 2;) {
            int randomNumber = (int) (Math.random() * 10);
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.\n"
                    + "Question:" + randomNumber
                    + "\nYour answer:");
            String answer = scanner.next();
            if (count == 2) {
                System.out.println("Congratulations, " + name);
                break;
            } else {
                if (randomNumber % 2 == 0) {
                    if (answer.equals("yes")) {
                        System.out.println("Correct!");
                        count++;
                    } else {
                        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'yes'.\n"
                                + "Let's try again, " + name);
                        break;
                    }
                } else {
                    if (answer.equals("no")) {
                        System.out.println("Correct!");
                        count++;
                    } else {
                        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'no'.\n"
                                + "Let's try again, " + name);
                        break;
                    }
                }
            }
        }
    }
}
