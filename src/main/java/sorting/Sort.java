package sorting;

import java.util.Comparator;

public interface Sort {

    <T extends Comparable<T>> void sort(T[] array);

    <T> void sort(T[] array, Comparator<T> comparator);
}