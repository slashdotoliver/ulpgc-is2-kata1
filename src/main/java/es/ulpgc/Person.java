package es.ulpgc;

import java.time.LocalDate;
import java.util.StringJoiner;

public class Person {
    private final String name;
    private final LocalDate birthdate;

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getName() {
        return name;
    }

    public int age() {
        return LocalDate.now().getYear() - birthdate.getYear();
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("birthdate=" + birthdate)
                .add("age=" + age())
                .toString();
    }
}
