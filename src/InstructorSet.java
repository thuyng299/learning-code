import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class InstructorSet {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        Set<Instructor> instructors = new HashSet<>();

        Instructor ins1 = new Instructor("Brown", "Andy", "ACB235");
        Instructor ins2 = new Instructor("Lana", "Nguyen", "ACB455");
        Instructor ins3 = new Instructor("Leslie", "Lee", "ACB755");
        Instructor ins4 = new Instructor("Anna", "Joe", "ACB334");

        instructors.add(ins1);
        instructors.add(ins2);
        instructors.add(ins3);
        instructors.add(ins4);

        Iterator<Instructor> iterator = instructors.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        System.out.println();

    }

}
