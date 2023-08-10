package lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class Lambda {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of(
                "alpha", "bravo", "charlie", "delta"
        ));

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("--------");

        // Using lambdas
        list.forEach(s -> System.out.println(s));

        // Not necessary since Java infers the data type of list that alr declared below
        list.forEach((String s) -> System.out.println(s));

        // Best practice, using method reference
        list.forEach(System.out::println);

        System.out.println("--------");

        // You can prefix in lambdas if not make any changes to that prefix or reassign it
        String prefix = "nato";
        list.forEach((var myString) -> {
            char first = myString.charAt(0);
            //  Use local variable from enclosing scope
            System.out.println(prefix + " " + myString + " means " + first);
        });
        int result1 = calculator((a, b) -> a + b, 5, 2);

        // Can be replaced by
        int result = calculator(Integer::sum, 5, 2);
        double result2 = calculator((a, b) -> a / b, 5, 2);
        var result3 = calculator((a, b) -> a.toUpperCase() + " " + b.toUpperCase(),
                "Ralph", "Kramden");

        // Consumer
        var coords = Arrays.asList(
                new double[]{47.2160, -95.2348},
                new double[]{29.1566, -89.2495},
                new double[]{35.1556, -90.0659});
        coords.forEach(s -> System.out.println(Arrays.toString(s)));

        BiConsumer<Double, Double> p1 = (lat, lng) ->
                System.out.printf("[lat:%.3f lng:%.3f]%n", lat, lng);

        var firstPoint = coords.get(0);
        processPoint(firstPoint[0], firstPoint[1], p1);

        System.out.println("------------");
        coords.forEach(s -> processPoint(s[0], s[1], p1));

        coords.forEach(s -> processPoint(s[0], s[1], (lat, lng) ->
                System.out.printf("[lat:%.3f lng:%.3f]%n", lat, lng)));

        list.removeIf(s -> s.equalsIgnoreCase("bravo"));
        list.forEach(System.out::println);

        list.addAll(List.of("echo", "easy", "earnest"));
        list.forEach(System.out::println);

        System.out.println("------------");
        list.removeIf(s -> s.startsWith("ea"));
        list.forEach(System.out::println);

        list.replaceAll(s -> s.charAt(0) + " - " + s.toUpperCase());
        System.out.println("------------");
        list.forEach(System.out::println);

        String[] emptyString = new String[10];
        System.out.println(Arrays.toString(emptyString));
        Arrays.fill(emptyString, "");
        System.out.println(Arrays.toString(emptyString));

        Arrays.setAll(emptyString, i -> "" + (i + 1) + ". "
//                        + switch (i) {
//                    case (0) -> "one";
//                    case (1) -> "two";
//                    case (2) -> "three";
//                    default -> "";
//                }
        );
        String[] names = {"Ann", "Bob", "Carol", "David", "Ed", "Fred"};
        String[] randomList = randomSelectedValues(15, names, () -> new Random().nextInt(names.length));
        System.out.println(Arrays.toString(randomList));
    }

    public static <T> T calculator(BinaryOperator<T> function, T value1, T value2) {
        T result = function.apply(value1, value2);
        System.out.println("Result of operation: " + result);
        return result;
    }

    public static <T> void processPoint(T t1, T t2, BiConsumer<T, T> consumer) {
        consumer.accept(t1, t2);
    }

    public static String[] randomSelectedValues(int count, String[] values, Supplier<Integer> s) {
        String[] selectedValues = new String[count];

        for (int i = 0; i < count; i++) {
            selectedValues[i] = values[s.get()];
        }
        return selectedValues;
    }
}