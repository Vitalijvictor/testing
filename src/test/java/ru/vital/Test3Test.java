package ru.vital;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class Test3Test {
    Test3 test3 = null;

    @Before
    public void setUp() {
        Test3 test3 = new Test3();
    }

    @Test
    public void manWeight() {
        short height = 187;
        double rsl = 100.05;
        Assert.assertThat(test3.manWeight(height), is(rsl));
    }

    @After
    public void tearDown() {
        test3 = null;
    }
}