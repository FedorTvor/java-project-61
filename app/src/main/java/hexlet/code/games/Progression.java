package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Progression {
    public static void progression() {
        Scanner scanner = new Scanner(System.in);
        for (var count = 0; count <= 2; count++) {
            int[] result = new int[5];
            int num = Engine.getRandomNumber(10);
            result[0] = Engine.getRandomNumber(100);
            if (result[0] != result[1]) {
                for (var i = 1; i < result.length; i++) {
                    result[i] = result[i - 1] + num;
                }
            }
            System.out.println("What number is missing in the progression?\n"
                    + "Question: " + result[0] + " " + result[1] + " .. " + result[3] + " " + result[4]);
            int answer = scanner.nextInt();
            if (answer == result[2]) {
                Engine.congratulations(count);
            } else {
                Engine.uncorrectAnswer(answer, result[2]);
                break;
            }
        }
    }
}
