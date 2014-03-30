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
