package AcademItSchool.Lesson9;

import java.util.Arrays;

public class ArrayStringsToUpperCase {
    public static String[] getArraysStringsToUpperCase(String[] arrayStrings) {
        String[] arrayStringsToUpperCase = new String[arrayStrings.length];

        for (int i = 0; i <= arrayStrings.length - 1; i++) {
            arrayStringsToUpperCase[i] = arrayStrings[i].toUpperCase();
        }

        return arrayStringsToUpperCase;
    }

    public static void main(String[] args) {
        String[] arrayStrings = new String[]{"aaa", "bbb", "ccc"};

        System.out.println(Arrays.toString(getArraysStringsToUpperCase(arrayStrings)));
    }
}
