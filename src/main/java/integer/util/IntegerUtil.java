package integer.util;

public class IntegerUtil {

    private IntegerUtil() {

    }

    public static Integer[] convertToArray(final Integer value) {
        if (value == null) return new Integer[0];

        final String stringValue = Integer.toString(value);

        Integer[] arrayIntegers = new Integer[stringValue.length()];

        for (int i = 0; i < stringValue.length(); i++) {
            arrayIntegers[i] = stringValue.charAt(i) - '0';
        }

        return arrayIntegers;
    }

    public static String convertArrayToString(final Integer[] array){
        final StringBuilder builder = new StringBuilder();

        for (Integer currentValue : array) {
            builder.append(currentValue);
        }

        return builder.toString();
    }
}