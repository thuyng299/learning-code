package lambdaexpression.person;

import java.util.*;
import java.util.stream.Collectors;

public class PersonDemo {
    /*
    Using nested static record class, introduced in Java 14

    A record is a compact way of defining classes for holding immutable data ̣simply create classes

    for holding immutable data with less boilerplate code.
     */
//    public record Person(String firstName, String lastName) {
//
//        // Custom toString() method to represent Person objects as "firstName lastName"
//        @Override
//        public String toString() {
//            return firstName + " " + lastName;
//        }
//    }

    public static void main(String[] args) {

        // Creating a list of Person objects using the constructor of the Main.Person record class
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Lucy", "Van Pelt"),
                new Person("Sally", "Brown"),
                new Person("Linus", "Van Pelt"),
                new Person("Peppermint", "Patty"),
                new Person("Charlie", "Brown")
        ));

//       var comparatorLastName = new Comparator<Person>() {
//
//           @Override
//           public int compare(Person o1, Person o2) {
//               return o1.getLastName().compareTo(o2.getLastName());
//           }
//       };

        /*
        void sort (Comparator c)
        sort is method declaration


         */
        people.sort((o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
        System.out.println(people);

        people.sort(Comparator.comparing(Person::getLastName));
        System.out.println(people);


        var comparatorMixed = new EnhancedComparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.getLastName().compareTo(o2.getLastName());
                return (result == 0 ? secondLevel(o1, o2) : result);
            }

            @Override
            public int secondLevel(Person o1, Person o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        };

        people.sort(comparatorMixed);
        System.out.println(people);

    }
}