package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {
    public static void prime() {
        Scanner scanner = new Scanner(System.in);
        for (var count = 0; count <= 2; count++) {
            int randomNumber = (int) (Math.random() * 10);
            System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.\n"
                    + "Question: " + randomNumber
                    + "\nYour answer:");
            String answer = scanner.next();
            if (Engine.isSimple(randomNumber)) {
                if (answer.equals("yes")) {
                    Engine.congratulations(count);
                } else {
                    Engine.uncorrectAnswer(answer, "yes");
                    break;
                }
            } else {
                if (answer.equals("no")) {
                    Engine.congratulations(count);
                } else {
                    Engine.uncorrectAnswer(answer, "no");
                    break;
                }
            }
        }
    }
}
