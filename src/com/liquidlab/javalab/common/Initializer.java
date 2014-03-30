package com.liquidlab.javalab.common;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tham
 */
public class Initializer {

    public static final List<Person> getPersons() {
        List<Person> persons = new ArrayList<Person>(8);

        persons.add(new Person("Ryan", 28));
        persons.add(new Person("Gates", 66));
        persons.add(new Person("Jobs", 56));
        persons.add(new Person("Wales", 52));
        persons.add(new Person("James", 58));

        return persons;
    }
}
