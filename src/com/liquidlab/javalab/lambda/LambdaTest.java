package com.liquidlab.javalab.lambda;

import org.junit.Ignore;
import org.junit.Test;

/**
 * @author tham
 */
public class LambdaTest {

    @Test
    @Ignore
    public void testPersonSort() {
        Lambda lambda = new Lambda();
        lambda.sortByOldStyle();
        lambda.sortByLambda();
    }

    @Test
    @Ignore
    public void testPrintPerson() {
        Lambda lambda = new Lambda();
        lambda.printPersons();
    }

    @Test
    @Ignore
    public void testRemovePerson() {
        Lambda lambda = new Lambda();
        lambda.removePerson();
    }

    @Test
    public void testComplexComparison() {
        Lambda lambda = new Lambda();
        lambda.complexComparison();
    }
}
