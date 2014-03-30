package com.liquidlab.javalab.lambda;

import com.liquidlab.javalab.common.Initializer;
import com.liquidlab.javalab.common.Person;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author tham
 */
public class Lambda {
    public void sortByOldStyle() {
        List<Person> persons = Initializer.getPersons();
        System.out.println("Before Sorting: " + persons);

        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        System.out.println("Sort done by old style: " + persons);
    }

    public void sortByLambda() {
        List<Person> persons = Initializer.getPersons();
        System.out.println("Before Sorting: " + persons);

        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        System.out.println("Sort done by Lambda: " + persons);
    }
}
