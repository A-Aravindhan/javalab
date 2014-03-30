/*
 * Copyright 2014 JavaLab
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.liquidlab.javalab.lambda;

import com.liquidlab.javalab.common.Initializer;
import com.liquidlab.javalab.common.Person;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * @author tham
 */
public class Lambda {
    /**
     * Explains the sort method using old style of Java
     */
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

    /**
     * Explains about the sort method using Lambda expressions
     */
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

    /**
     * Explains about the functional interface style change with Lambda expressions
     */
    public void printPersons() {
        List<Person> persons = Initializer.getPersons();

        //Without Lambda
        System.out.println("Print persons with normal iteration");
        for (Person person : persons) {
            System.out.print(person.getName() + "\t");
        }

        //With Lambda
        System.out.println(" \nPrint persons with Lambda expression");
        persons.forEach(p -> System.out.print(p.getName() + "\t"));
    }

    /**
     * Explains about the remove function using Lambda expressions
     */
    public void removePerson() {
        List<Person> persons = Initializer.getPersons();

        //Without Lambda expressions
        Person person = null;
        for (Iterator<Person> iterator = persons.iterator(); iterator.hasNext();) {
            person = iterator.next();
            if ("Wales".equals(person.getName())) {
                iterator.remove();
            }
        }
        System.out.print("After the removal: " + persons);

        //With Lambda expressions
        persons.removeIf(p -> "Wales".equals(p.getName()));
        System.out.println("Removed using Lambda expressions: " + persons);
    }

    public void complexComparison() {
        List<Person> persons = Initializer.getPersons();

        //Age and name based sorting using normal Java way
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                int ageComparison = ((Integer)p1.getAge()).compareTo(p2.getAge());
                if (ageComparison != 0) {
                    return ageComparison;
                }

                return p1.getName().compareTo(p2.getName());
            }
        });
        System.out.println("Normal comparison: " + persons);

        persons.sort(Comparator.comparing(Person::getAge).thenComparing(Person::getName));
        System.out.println(persons);
    }
}
