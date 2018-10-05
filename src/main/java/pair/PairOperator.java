package pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PairOperator {

    public List<Pair> getMinimumDifference(final List<Integer> numbers) {
        Collections.sort(numbers);

        List<Pair> pairs = new ArrayList<>();

        int minimumDifference = Integer.MAX_VALUE;

        for(int index = 1; index < numbers.size(); index++) {
            int valueOne = numbers.get(index);
            int valueTwo = numbers.get(index - 1);

            int difference = valueOne - valueTwo;

            difference = (difference < 0) ? -difference : difference;

            if(difference < minimumDifference) {
                minimumDifference = difference;
                pairs.clear();
                Pair pair = new Pair(valueTwo, valueOne);
                pairs.add(pair);
            } else if(difference == minimumDifference) {
                Pair pair = new Pair(valueTwo, valueOne);
                pairs.add(pair);
            }
        }

        return pairs;
    }
}