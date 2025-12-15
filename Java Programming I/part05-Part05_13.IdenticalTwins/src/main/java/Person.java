
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Person)) {
            return false;
        }

        Person comparedPerson = (Person) compared;

        return name.equals(comparedPerson.getName())
                && height == comparedPerson.getHeight()
                && weight == comparedPerson.getWeight()
                && birthday.getDay() == comparedPerson.getBirthday().getDay()
                && birthday.getMonth() == comparedPerson.getBirthday().getMonth()
                && birthday.getYear() == comparedPerson.getBirthday().getYear();
    }

    public String getName() {
        return name;
    }

    public SimpleDate getBirthday() {
        return birthday;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

}
