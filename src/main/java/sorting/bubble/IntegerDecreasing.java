package sorting.bubble;

import java.util.Comparator;

public class IntegerDecreasing implements Comparator<Integer> {

    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o2, o1);
    }
}