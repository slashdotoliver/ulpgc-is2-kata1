package es.ulpgc;

import java.time.LocalDate;
import java.util.StringJoiner;

public record Person(String name, LocalDate birthdate) {

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
