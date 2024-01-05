package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class EvenNumber {
    public static void evenNumber() {
        Scanner scanner = new Scanner(System.in);
        for (var count = 0; count <= 2; count++) {
            int randomNumber = (int) (Math.random() * 10);
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.\n"
                    + "Question: " + randomNumber
                    + "\nYour answer:");
            String answer = scanner.next();
            if (randomNumber % 2 == 0) {
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
