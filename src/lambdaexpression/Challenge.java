package lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Challenge {
    private static Random random = new Random();

    public static void main(String[] args) {
        String[] names = {"Anna", "Bob", "Ed", "Carol", "David"};

        Arrays.setAll(names, i -> names[i].toUpperCase());

        System.out.println(Arrays.toString(names));

        List<String> backedByArray = Arrays.asList(names);

        backedByArray.replaceAll(s -> s += " " + getRandomChar('A', 'D') + ".");
        System.out.println(Arrays.toString(names));

        backedByArray.replaceAll(s -> s += " " + getReveredName(s.split(" ")[0]));
        Arrays.asList(names).forEach(System.out::println);

        List<String> newList = new ArrayList<>(List.of(names));

//        newList.removeIf(s -> s.substring(0, s.indexOf(" ")).equals(
//                s.substring(s.lastIndexOf(" ") + 1)));

        newList.removeIf(s -> {
            String first = s.substring(0, s.indexOf(" "));
            String last = s.substring(s.lastIndexOf(" ") + 1);
            return first.equals(last);
        });

        System.out.println("Remove name where first equals last");
        newList.forEach(System.out::println);



    }

    public static char getRandomChar(char startChar, char endChar) {
        return (char) random.nextInt();
//        return (char) random.nextInt((int) startChar, (int) endChar);
    }

    private static String getReveredName(String firstName) {
        return new StringBuilder(firstName).reverse().toString();
    }

}
