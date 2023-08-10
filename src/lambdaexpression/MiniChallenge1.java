package lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MiniChallenge1 {
    public static void main(String[] args) {
        Consumer<String> printTheParts = new Consumer<String>() {
            @Override
            public void accept(String s) {
                String[] parts = s.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };

        Consumer<String> printWordsLambda = s -> {
            String[] parts = s.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };
        printWordsLambda.accept("I am hungry");

        Consumer<String> printWordsEach = s -> {
            String[] parts = s.split(" ");
            Arrays.asList(parts).forEach(System.out::println);
        };
        printWordsEach.accept("I am hungry");

        Consumer<String> printWordsConcise = s -> {
            Arrays.asList(s.split(" ")).forEach(System.out::println);
        };
        printWordsConcise.accept("I am hungry");
    }
}
