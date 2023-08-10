package lambdaexpression;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MiniChallenge2 {
    public static void main(String[] args) {
        UnaryOperator<String> eachSecondChar = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };
        System.out.println(eachSecondChar.apply("1234567890"));
        String result = everySecondCharacter(eachSecondChar, "1234567890");
        System.out.println(result);

        Supplier<String> iLoveJava = () -> "I love Java!";
        System.out.println(iLoveJava.get());
    }

    public static String everySecondChar(String source) {
        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }

    public static String everySecondCharacter(Function<String, String> function,
                                              String s) {
        return function.apply(s);
    }
}
