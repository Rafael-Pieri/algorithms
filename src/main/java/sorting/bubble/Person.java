package sorting.bubble;

public class Person implements Comparable<Person> {

    private final Integer age;
    private final String name;

    public Person(final int age, final String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(final Person other) {
        if (this.age < other.age) {
            return -1;
        }
        return 1;
    }

    @Override
    public String toString() {
        return "Person{" + "age=" + age + ", name='" + name + '\'' + '}';
    }
}