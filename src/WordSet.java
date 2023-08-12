import java.util.Set;
import java.util.TreeSet;

public class WordSet {
    public static void main(String[] args) {
        String line = "I am hungry";

        String[] words = line.split("\\s");

        Set<String> wordSet = new TreeSet<>();

        for (String word: words){
            wordSet.add(word.toLowerCase());
        }

        wordSet.forEach(System.out::println);
    }

}
//import java.util.*;
//
//public class UniqueWords {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a line of text: ");
//        String line = scanner.nextLine();
//
//        // Tokenize the input line and store unique words in a TreeSet
//        Set<String> uniqueWords = new TreeSet<>();
//        String[] words = line.split("\\s");
//        for (String word : words) {
//            uniqueWords.add(word.toLowerCase()); // Convert to lowercase to ignore case sensitivity
//        }
//
//        // Display the unique words in ascending order
//        System.out.println("Unique words in ascending order:");
//        for (String word : uniqueWords) {
//            System.out.println(word);
//        }
//    }
//}


