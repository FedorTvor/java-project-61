package hexlet.code.games;

import hexlet.code.Engine;
public class Prime {
    public static void prime() {
        Engine.greeting();
        final int finalCount = 2;
        final int factor = 10;
        final String condition = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        var question = question(finalCount, factor);
        Engine.stepGame(condition, question, finalCount);
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
    public static String[][] question(int finalCount, int factor) {
        String[][] result = new String[finalCount+1][finalCount+1];
        for (var step1 = 0; step1 <= finalCount; step1++)  {
            var randomNumber = Engine.getRandomNumber(factor);
            final String question = "" + randomNumber;
            String isSimple= Engine.getYesOrNo(isSimple(randomNumber));
            result[step1][0]= randomNumber+"";
            result[step1][1] = question;
            result[step1][2] = isSimple;
        }
        return result;
    }
}
