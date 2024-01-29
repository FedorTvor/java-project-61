package hexlet.code.games;

import hexlet.code.Engine;
public class Progression {
    public static void progression() {
        Engine.greeting();
        var finalCount = 2;
        var condition = "What number is missing in the progression?";
        for (var count = 0; count <= finalCount; count++) {
            var step = Engine.getRandomNumber1();
            var firstNum = Engine.getRandomNumber1();
            var massivLength = randomDiaposon(5, 9);
            var hiddenNumber = randomDiaposon(1, massivLength - 1);
            int[] massivProgression = randomMassiv(massivLength, step, firstNum);
            var correct = massivProgression[hiddenNumber];
            var question = showMassiv(massivProgression, hiddenNumber);
            Engine.stepGame(condition, question, correct, count, finalCount);
        }
    }
    public static int[] randomMassiv(int massiveLength, int step, int firstNum) {
        int[] result = new int[massiveLength];
        result[0] = firstNum;
        for (var i = 1; i < result.length; i++) {
            if (step != 0) {
                result[i] = result[i - 1] + step;
            } else {
                step = 5;
                i--;
            }
        }
        return result;
    }
    public static String showMassiv(int[] massivProgression, int hiddenNumber) {
        var result = massivProgression[0] + "";
        var middle = massivProgression[hiddenNumber];
        for (var i = 1; i < massivProgression.length; i++) {
            if (massivProgression[i] != middle) {
                result = result + " " + massivProgression[i];
            } else {
                result = result + " " + "..";
            }
        }
        return  result;
    }
    public static int randomDiaposon(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
