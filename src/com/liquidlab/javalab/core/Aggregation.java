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

package com.liquidlab.javalab.core;

import com.liquidlab.javalab.common.Initializer;
import com.liquidlab.javalab.common.Person;

import java.util.List;

/**
 * @author tham
 */
public class Aggregation {
    public int getAverageAge() {
        List<Person> persons = Initializer.getPersons();
//        int highestAge =
//                persons.stream()
//                        .mapToInt(p -> p.getAge())
//                        .max();
        return 0;
    }
}
