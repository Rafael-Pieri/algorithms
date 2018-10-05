package arraydegree;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ArrayDegreeTest {

    @Test
    public void shouldCalculateDegreeOfArray() {
        final List<Integer> data = Arrays.asList(1, 2, 2, 3, 1);

        final ArrayDegree arrayDegree = new ArrayDegree();

        final int value = arrayDegree.calculate(data);

        assertEquals(2, value);
    }
}