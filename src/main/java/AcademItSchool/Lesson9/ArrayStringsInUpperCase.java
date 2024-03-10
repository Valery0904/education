package AcademItSchool.Lesson9;

import java.util.Arrays;

public class ArrayStringsInUpperCase {
    public static String[] getArrayStringsInUpperCase(String[] stringsArray) {
        for (int i = 0; i < stringsArray.length; i++) {
            stringsArray[i] = stringsArray[i].toUpperCase();
        }

        return stringsArray;
    }

    public static void main(String[] args) {
        String[] stringsArray = {"aaa", "bbb", "ccc"};

        System.out.println(Arrays.toString(getArrayStringsInUpperCase(stringsArray)));
    }
}
