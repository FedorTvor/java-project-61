package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {
    public static void prime() {
        Scanner scanner = new Scanner(System.in);
        for (var count = 0; count <= 2; count++) {
            int randomNumber = Engine.getRandomNumber1();
            var condition = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
            var question = "" + randomNumber;

            Engine.stringQestion(condition, question);
            var answer = Engine.getStringAnswer();
            if (isSimple(randomNumber)) {
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
    public static boolean isSimple(Integer number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
