package com.liquidlab.javalab.lambda;

import org.junit.Test;

/**
 * @author tham
 */
public class LambdaTest {

    @Test
    public void testPersonSort() {
        Lambda lambda = new Lambda();
        lambda.sortByOldStyle();

        lambda.sortByLambda();
    }
}
