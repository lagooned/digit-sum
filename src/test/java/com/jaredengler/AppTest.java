
package com.jaredengler;

import java.util.Arrays;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase {

    private DigitSummer digitSummer;

    public AppTest(final String testName) {
        super(testName);
        digitSummer = new DigitSummer();
    }

    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    public void testCreateArrayOfCharsFrom() {
        final List<String> expected = Arrays.asList("1", "1");
        final List<String> actual = digitSummer.createArrayOfCharsFrom(11);
        assertEquals(expected, actual);
    }

    public void testReducedPartialSum() {
        final Integer expected = 2;
        final Integer actual = digitSummer.digitalSum(Arrays.asList("1", "1"));
        assertEquals(expected, actual);
    }

    public void testReducedDigitSum() {
        final Integer expected = 2;
        final Integer actual = digitSummer.reducedDigitalSum(Arrays.asList("1", "1", "9"));
        assertEquals(expected, actual);
    }

}
