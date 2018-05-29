package sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
import sorting.bubble.BubbleSort;
import sorting.bubble.IntegerDecreasing;
import sorting.bubble.Person;

public class BubbleSortTest {

    @Test
    public void emptyArray() {
        BubbleSort bubbleSort = new BubbleSort();

        Integer[] input = new Integer[] {};

        bubbleSort.sort(input);

        assertArrayEquals(new Integer[] {}, input);
    }

    @Test
    public void arrayWithAnElement() {
        BubbleSort bubbleSort = new BubbleSort();

        Integer[] input = new Integer[] {1};

        bubbleSort.sort(input);

        assertArrayEquals(new Integer[] {1}, input);
    }

    @Test
    public void arrayWithFiveElements() {
        BubbleSort bubbleSort = new BubbleSort();

        Integer[] input = new Integer[] {5, 4, 3, 2, 1};

        bubbleSort.sort(input);

        assertArrayEquals(new Integer[] {1, 2, 3, 4, 5}, input);
    }

    @Test
    public void arrayWithFiveInvertedElements() {
        BubbleSort bubbleSort = new BubbleSort();

        Integer[] input = new Integer[] {1, 2, 3, 4, 5};

        bubbleSort.sort(input, new IntegerDecreasing());

        assertArrayEquals(new Integer[] {5, 4, 3, 2, 1}, input);
    }

    @Test
    public void person() {
        Person rafael = new Person(10, "Rafael");
        Person barbara = new Person(5, "Barbara");
        Person raul = new Person(8, "Raul");

        Person[] listOfPeople = new Person[] {rafael, barbara, raul};

        Sort sorter = new BubbleSort();

        sorter.sort(listOfPeople);

        Person[] expectedListOfPeople = new Person[] {barbara, raul, rafael};

        assertArrayEquals(expectedListOfPeople, listOfPeople);
    }
}