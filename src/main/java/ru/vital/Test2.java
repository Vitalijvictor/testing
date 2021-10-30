package ru.vital;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static int aAndB() {
        int a = 2;
        int b = 3;
        int c = 2 + 3;
        System.out.println("c = " + c);
        return c;
    }

    public static int[] array1() {
        int[] array1 = new int[4];
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        return array1;
    }

    public static int[] array2() {
        int[] array2 = new int[4];
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] % 2 != 0) {
                System.out.println(array2[i]);
            }
        }
        return array2;
    }

    public static boolean array3() {
        String[] array3 = new String[4];
        for (int i = 0; i < array3.length; i++) {
            if (array3[i].contains("o")) {
                return true;
            }
        }
        return false;
    }

    public static String name1 = "John";
    public static String name2 = "Inga";

    public static String checkNull(String check1, String check2) {
        String containsO = "These words contain letter O";
        String dontContainsO = "These words don't contain letter A";

        if (check1.contains("o")) {
            return null;
        }
        if (check2.contains("a")) {
            return containsO;
        } else {
            return dontContainsO;
        }
    }

    public static void main(String[] args) {
        Test2.aAndB();
        Test2.array1();
        Test2.array2();
        Test2.array3();
    }
}
