package hexlet.code.games;

import hexlet.code.Engine;
public class Gcd {
    public static void greatestCommonDivisor() {
        Engine.greeting();
        final int finalCount = 2;
        final int factor = 100;
        final String condition = "Find the greatest common divisor of given numbers.";
        var question = question(finalCount, factor);
        Engine.stepGame(condition, question, finalCount);
    }
    public static int gcd(int a, int b) {
        int result = 0;
        for (int i = 1; i <= Math.max(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                result = i;
            }
        }
        return result;
    }
    public static String[][] question(int finalCount, int factor) {
        String[][] result = new String[finalCount+1][finalCount+1];
        for (var step1 = 0; step1 <= finalCount; step1++)  {
            int randomNumber1 = Engine.getRandomNumber(factor);
            int randomNumber2 = Engine.getRandomNumber(factor);
            final String question = randomNumber1 + " " + randomNumber2;
            final int correctInt = gcd(randomNumber1, randomNumber2);
            result[step1][0] = null;
            result[step1][1] = question;
            result[step1][2] = correctInt + "";
        }
        return result;
    }
}
