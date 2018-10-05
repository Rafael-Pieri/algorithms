package pair;

public class Pair {
    private Integer valueOne;
    private Integer valueTwo;

    Pair(Integer valueOne, Integer valueTwo) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    public Integer getValueOne() {
        return valueOne;
    }

    public Integer getValueTwo() {
        return valueTwo;
    }

    @Override
    public String toString() {
        return "(" + valueOne + "," + valueTwo + ')';
    }
}