package lambdaexpression.person;

import java.util.Comparator;
public interface EnhancedComparator<T> extends Comparator<T> {
        int secondLevel (T o1, T o2);
    }

