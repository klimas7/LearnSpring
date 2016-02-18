package pl.klimas7.learnSpring;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MainClassTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public MainClassTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(MainClassTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }
}
