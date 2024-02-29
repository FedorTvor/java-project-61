package hexlet.code.games;

import hexlet.code.Engine;
public class Progression {
    public static void progression() {
        Engine.greeting();
        final int finalCount = 2;
        final int factor = 10;
        final String condition = "What number is missing in the progression?";
        var question = question(finalCount, factor);
        Engine.stepGame(condition, question, finalCount);
    }
    public static String[][] question(int finalCount, int factor) {
        String[][] result = new String[finalCount + 1][finalCount + 1];
        for (var step1 = 0; step1 <= finalCount; step1++)  {
            final int min = 5;
            final int max = 9;
            int  step = Engine.getRandomNumber(factor);
            int firstNum = Engine.getRandomNumber(factor);
            int massivLength = randomDiaposon(min, max);
            int  hiddenNumber = randomDiaposon(1, massivLength - 1);
            int[] massivProgression = randomMassiv(massivLength, step, firstNum);
            final String question = showMassiv(massivProgression, hiddenNumber);
            int correctInt = massivProgression[hiddenNumber];
            String correct = correctInt + "";
            result[step1][0] = null;
            result[step1][1] = question;
            result[step1][2] = correct;
        }
        return result;
    }
    public static int[] randomMassiv(int massiveLength, int step, int firstNum) {
        final int deffStep = 5;
        int[] result = new int[massiveLength];
        result[0] = firstNum;
        for (var i = 1; i < result.length; i++) {
            if (step != 0) {
                result[i] = result[i - 1] + step;
            } else {
                step = deffStep;
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
