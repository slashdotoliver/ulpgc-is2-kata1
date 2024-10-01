package es.ulpgc;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person juan = new Person("Juan", LocalDate.of(2002, 10, 1));
        System.out.println(juan);
    }
}
