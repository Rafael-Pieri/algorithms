package arraydegree;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayDegree {

    public int calculate(final List<Integer> data) {
        int max = 0;

        final Map<Integer, Integer> map = new HashMap<>();
        final Map<Integer, Integer> startIndex = new HashMap<>();
        final Map<Integer, Integer> endIndex = new HashMap<>();

        for (int i = 0; i < data.size(); i++) {
            int value = data.get(i);

            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                startIndex.put(value, i);
                map.put(value, 1);
            }

            endIndex.put(value, i);
            max = Integer.max(max, map.get(value));
        }

        int result = data.size();

        for (Integer i : map.keySet()) {
            if (map.get(i) == max) {
                int len = endIndex.get(i) - startIndex.get(i) + 1;
                result = Integer.min(result, len);
            }
        }

        return result;
    }
}