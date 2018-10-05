package pair;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PairOperatorTest {

    @Test
    public void shouldGetMinimumDifference() {
        final PairOperator pairOperator = new PairOperator();

        final List<Integer> numbers = Arrays.asList(4, 4, 2, 1, 3);

        final List<Pair> pairs = pairOperator.getMinimumDifference(numbers);

        assertEquals(new Integer(4), pairs.get(0).getValueOne());
        assertEquals(new Integer(4), pairs.get(0).getValueTwo());
    }
}