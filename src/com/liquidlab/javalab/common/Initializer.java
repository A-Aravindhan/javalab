package com.liquidlab.javalab.common;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tham
 */
public class Initializer {

    public static final List<Person> getPersons() {
        List<Person> persons = new ArrayList<Person>(8);

        persons.add(new Person("Ryan", 36));
        persons.add(new Person("Gates", 36));
        persons.add(new Person("Jobs", 36));
        persons.add(new Person("Wales", 36));
        persons.add(new Person("James", 36));

        return persons;
    }
}
