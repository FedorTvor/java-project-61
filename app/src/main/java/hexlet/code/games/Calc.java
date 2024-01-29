package hexlet.code.games;

import hexlet.code.Engine;
public class Calc {
    public static void calc() {
        Engine.greeting();
        var finalCount = 2;
        for (var count = 0; count <= finalCount; count++) {
            var sym = randomGame();
            var randomNumber1 = Engine.getRandomNumber2();
            var randomNumber2 = Engine.getRandomNumber2();
            var condition = "What is the result of the expression?";
            var question = randomNumber1 + " " + sym + " " + randomNumber2;
            var correct = numberExpression(randomNumber1, sym, randomNumber2);
            Engine.stepGame(condition, question, correct, count, finalCount);
        }
    }
    public static int numberExpression(int a, String sym, int b) {
        var result = 0;
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
        var randomGame = Engine.getRandomNumber1();
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
