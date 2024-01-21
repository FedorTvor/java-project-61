package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Progression {
    public static void progression() {
        Engine.greeting();
        Scanner scanner = new Scanner(System.in);
        var finalCount = 2;
        var condition = "What number is missing in the progression?";
        for (var count = 0; count <= finalCount; count++) {
            var step = Engine.getRandomNumber1();
            var firstNum = Engine.getRandomNumber1();
            var massivLength = 5;
            int[] massivProgression = randomMassiv(massivLength, step, firstNum);
            var correct = massivProgression[2];
            var question = showMassiv(massivProgression);
            Engine.stepGame(condition, question, correct, count, finalCount);
        }
    }
    public static int[] randomMassiv(int massiveLength, int step, int firstNum) {
        int[] result = new int[massiveLength];
        result[0] = firstNum;
        if (result[0] != result[1] && result[0] != 0) {
            for (var i = 1; i < result.length; i++) {
                if (result[i - 1] != result[i]) {
                    result[i] = result[i - 1] + step;
                }
            }
        }
        return result;
    }
    public static String showMassiv(int[] massivProgression) {
        var result = massivProgression[0] + "";
        var middle = massivProgression[2];
        for (var i = 1; i < massivProgression.length; i++) {
            if (massivProgression[i] != middle) {
                result = result + " " + massivProgression[i];
            } else {
                result = result + " " + "..";
            }
        }
        return  result;
    }
}
