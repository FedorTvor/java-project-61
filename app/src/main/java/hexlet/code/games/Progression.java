package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Progression {
    public static void progression() {
        Scanner scanner = new Scanner(System.in);
        var num1 = 10;
        var num2 = 100;
        var massivLength = 5;
        var indexPosition3 = 3;
        var indexPosition4 = 4;
        for (var count = 0; count <= 2; count++) {
            int[] result = new int[massivLength];
            int num = Engine.getRandomNumber(num1);
            result[0] = Engine.getRandomNumber(num2);
            if (result[0] != result[1]) {
                for (var i = 1; i < result.length; i++) {
                    result[i] = result[i - 1] + num;
                }
            }
            System.out.println("What number is missing in the progression?\n"
                    + "Question: " + result[0] + " " + result[1] + " .. " + result[indexPosition3] + " " + result[indexPosition4]);
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
