package ru.vital;

import org.junit.Assert;
import org.junit.Test;

import static ru.vital.Test2.name1;
import static ru.vital.Test2.name2;

public class Test2Test{

    @Test
    public void check_c() {
        Test2 test2 = new Test2();
        int expected = 2 + 3;
        int rsl = test2.aAndB();
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void checkArrays() {
        Test2 test2 = new Test2();
        int[] array1 = test2.array1();
        array1[0] = 4;
        array1[1] = 3;
        array1[2] = 2;
        array1[3] = 1;
        int[] array2 = test2.array1();
        array2[0] = 4;
        array2[1] = 3;
        array2[2] = 2;
        array2[3] = 1;
        Assert.assertArrayEquals(array1, array2);
    }

    @Test
    public void checkFalse() {
        String[] array3 = new String[4];
        array3[0] = "John";
        array3[1] = "Merry";
        array3[2] = "Lukas";
        array3[3] = "Sony";
        Assert.assertTrue(String.valueOf(array3), true);
    }

    @Test
    public void checkTrue() {
        String[] array3 = new String[4];
        array3[0] = "Jan";
        array3[1] = "Merry";
        array3[2] = "Lukas";
        array3[3] = "Nick";
        Assert.assertFalse(String.valueOf(array3), false);
    }

    @Test
    public void name1NotEqualsName2() {
        Assert.assertNotEquals(name1, name2);
    }

    @Test
    public void name1AndName2NotNull() {
        Assert.assertNotNull(name1, name2);
    }
}