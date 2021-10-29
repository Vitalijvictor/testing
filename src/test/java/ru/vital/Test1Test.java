package ru.vital;

import junit.framework.TestCase;
import org.junit.Test;

public class Test1Test extends TestCase {

    @Test
    public void testCalc() {
        Test1 test1 = new Test1();
        int expected = test1.calc(2, 2, 4, '+');
        int actual = 4;
        assertEquals(expected, actual);
    }
}