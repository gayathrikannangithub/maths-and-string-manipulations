package com.gkannan.dsa;

import junit.framework.TestCase;
import org.junit.Test;

public class SquareRootTest extends TestCase {
    private SquareRoot squareRoot;
    @Test
    public void testPerformSquareRoot() throws Exception {
        squareRoot = new SquareRoot(7);
        assertEquals(squareRoot.performSquareRoot(7.89), 2.8089144);
    }

    @Test
    public void testPerformSquareRoot_TenPrecision() throws Exception {
        squareRoot = new SquareRoot(10);
        assertEquals(squareRoot.performSquareRoot(7.89), 2.8089143811);
    }

    @Test
    public void testPerformSquareRoot_PrecisionMoreThan10() throws Exception {
        squareRoot = new SquareRoot(11);
        assertEquals(squareRoot.performSquareRoot(7.89), SquareRootErrorTypes.WRONG_PRECISION.getValue());
    }

    @Test
    public void testPerformSquareRoot_negative() throws Exception {
        squareRoot = new SquareRoot(7);
        assertEquals(squareRoot.performSquareRoot(-7.89), SquareRootErrorTypes.NEGATIVE_INTEGER.getValue());
    }

    @Test
    public void testPerformSquareRoot_MoreThanMaxPrecision() throws Exception {
        squareRoot = new SquareRoot(11);
        assertEquals(squareRoot.performSquareRoot(7.89), SquareRootErrorTypes.WRONG_PRECISION.getValue());
    }

}