package hexlet.code.games;

import hexlet.code.Engine;

public class EvenNumber {
    public static void evenNumber() {
        Engine.greeting();
        final int finalCount = 2;
        final int factor = 10;
        final String condition = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        var question = question(finalCount, factor);
        Engine.stepGame(condition, question, finalCount);
    }
    public static boolean isEven(int num) {
        return  num % 2 == 0;
    }

    public static String[][] question(int finalCount, int factor) {
        String[][] result = new String[finalCount+1][finalCount+1];
        for (var step1 = 0; step1 <= finalCount; step1++)  {
            var randomNumber = Engine.getRandomNumber(factor);
            final String question = "" + randomNumber;
            String even = Engine.getYesOrNo(isEven(randomNumber));
            result[step1][0]= randomNumber+"";
            result[step1][1] = question;
            result[step1][2] = even;
        }
        return result;
    }
 }

