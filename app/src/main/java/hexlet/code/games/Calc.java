package hexlet.code.games;

import hexlet.code.Engine;
public class Calc {
    public static void calc() {
        Engine.greeting();
        final int finalCount = 2;
        String sym = randomGame();
        final int factor = 100;
        final String condition = "What is the result of the expression?";
        var question = question(finalCount, factor);
        Engine.stepGame(condition, question, finalCount);

    }
    public static String[][] question(int finalCount, int factor) {
        String[][] result = new String[finalCount + 1][finalCount + 1];
        for (var step1 = 0; step1 <= finalCount; step1++)  {
            String sym = randomGame();
            int randomNumber1 = Engine.getRandomNumber(factor);
            int randomNumber2 = Engine.getRandomNumber(factor);
            final String question = randomNumber1 + " " + sym + " " + randomNumber2;
            var correctInt = numberExpression(randomNumber1, sym, randomNumber2);
            result[step1][0] = sym;
            result[step1][1] = question;
            result[step1][2] = correctInt + "";
        }
        return result;
    }
    public static Integer numberExpression(int a, String sym, int b) {
        Integer result = null;
        if (sym.equals("+")) {
            result = a + b;
        } else if (sym.equals("-")) {
            result = a - b;
        } else if (sym.equals("*")) {
            result = a * b;
        }
        return  result;
    }
    public static String randomGame() {
        final int factor = 10;
        int randomGame = Engine.getRandomNumber(factor);
        final int divider = 3;
        if (randomGame % 2 == 0) {
            return "+";
        } else if (randomGame % divider == 0) {
            return  "-";
        } else {
            return "*";
        }
    }
}
