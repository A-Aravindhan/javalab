package com.liquidlab.javalab.core;

import org.junit.Test;

/**
 * @author  tham
 */
public class AggregationTest {

    @Test
    public void testAggregation() {
        Aggregation aggregation = new Aggregation();
        int numberOfPersons = aggregation.getPersonsWithAgeGT40();

        System.out.println(numberOfPersons);
    }

    @Test
    public void testNumericalStream() {
        Aggregation aggregation = new Aggregation();
        aggregation.numericalStream();
    }
}
