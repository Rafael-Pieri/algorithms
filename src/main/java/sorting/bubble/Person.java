package sorting.bubble;

public class Person implements Comparable<Person> {

    private final Integer age;
    private final String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "age=" + age + ", name='" + name + '\'' + '}';
    }

    @Override
    public int compareTo(Person other) {
        if (this.age < other.age) {
            return -1;
        }
        return 1;
    }
}