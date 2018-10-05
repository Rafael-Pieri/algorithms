package integer;

import exception.NullArgumentException;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class IntegerOperatorTest {

    @Test
    public void shouldMergeTwoEqualValues() {
        final IntegerOperator integerOperator = new IntegerOperator();
        final Integer interleavedValue = integerOperator.mergeValues(135, 246);

        assertEquals(Integer.valueOf(123456), interleavedValue);
    }

    @Test
    public void shouldMergeValueWithFewerDigitsThatTheSecondOne() {
        final IntegerOperator integerOperator = new IntegerOperator();
        final Integer interleavedValue = integerOperator.mergeValues(10, 5126);

        assertEquals(Integer.valueOf(150126), interleavedValue);
    }

    @Test
    public void shouldMergeValueWithMoreDigitsThatTheSecondOne() {
        final IntegerOperator integerOperator = new IntegerOperator();
        final Integer interleavedValue = integerOperator.mergeValues(5126, 10);

        assertEquals(Integer.valueOf(511026), interleavedValue);
    }

    @Test
    public void shouldReturnFirstValueWhenTheSecondOneIsNotProvided() {
        final IntegerOperator integerOperator = new IntegerOperator();
        final Integer interleavedValue = integerOperator.mergeValues(10256, null);

        assertEquals(Integer.valueOf(10256), interleavedValue);
    }

    @Test
    public void shouldReturnSecondValueWhenTheFirstOneIsNotProvided() {
        final IntegerOperator integerOperator = new IntegerOperator();
        final Integer interleavedValue = integerOperator.mergeValues(null, 512);

        assertEquals(Integer.valueOf(512), interleavedValue);
    }

    @Test
    public void shouldReturnMinusOneWhenResultExceedsMaximumAllowableValue() {
        final IntegerOperator integerOperator = new IntegerOperator();
        final Integer interleavedValue = integerOperator.mergeValues(512, 10256);

        assertEquals(Integer.valueOf(-1), interleavedValue);
    }

    @Test(expected = NullArgumentException.class)
    public void shouldThrowAnExceptionWhenNoValueIsProvided() {
        final IntegerOperator integerOperator = new IntegerOperator();
        integerOperator.mergeValues(null, null);
    }

    @Test
    public void shouldGetPositionOfTheBitsEqualToOne() {
        final IntegerOperator integerOperator = new IntegerOperator();
        final List<Integer> bits = integerOperator.getPositionOfTheBitsEqualToOne(51);

        assertEquals(Arrays.asList(4, 1, 2, 5, 6), bits);
    }
}