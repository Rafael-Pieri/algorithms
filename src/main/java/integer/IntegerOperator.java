package integer;

import exception.NullArgumentException;
import integer.util.IntegerUtil;

import java.util.ArrayList;
import java.util.List;

public class IntegerOperator {

    public int mergeValues(final Integer valueOne, final Integer valueTwo) {
        isAtLeastAValueOtherThanNull(valueOne, valueTwo);

        final Integer[] valueOneArray = IntegerUtil.convertToArray(valueOne);
        final Integer[] valueTwoArray = IntegerUtil.convertToArray(valueTwo);

        final int valueOneArrayLength = valueOneArray.length;
        final int valueTwoArrayLength = valueTwoArray.length;

        Integer[] mergedArray = new Integer[valueOneArrayLength + valueTwoArrayLength];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < valueOneArrayLength && j < valueTwoArrayLength) {
            mergedArray[k++] = valueOneArray[i++];
            mergedArray[k++] = valueTwoArray[j++];
        }

        while (i < valueOneArray.length) mergedArray[k++] = valueOneArray[i++];

        while (j < valueTwoArray.length) mergedArray[k++] = valueTwoArray[j++];

        Integer valueResult = Integer.valueOf(IntegerUtil.convertArrayToString(mergedArray));

        return valueResult > 1000000 ? -1 : valueResult;
    }

    public List<Integer> getPositionOfTheBitsEqualToOne(final int value) {
        final List<Integer> positions = new ArrayList<>();
        int count = 0;

        final String binaryValue = Integer.toBinaryString(value);

        for (int index = 0; index < binaryValue.length(); index++) {
            if (binaryValue.charAt(index) == '1') {
                positions.add(index + 1);
                count++;
            }
        }

        positions.add(0, count);

        return positions;
    }

    private void isAtLeastAValueOtherThanNull(final Integer valueOne, final Integer valueTwo) {
        if (valueOne == null && valueTwo == null) {
            throw new NullArgumentException("At least one value is required.");
        }
    }
}