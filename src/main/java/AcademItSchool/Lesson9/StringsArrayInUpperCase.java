package AcademItSchool.Lesson9;

import java.util.Arrays;

public class StringsArrayInUpperCase {
    public static void stringsArrayInUpperCase(String[] stringsArray) {
        for (int i = 0; i < stringsArray.length; i++) {
            stringsArray[i] = stringsArray[i].toUpperCase();
        }
    }

    public static void main(String[] args) {
        String[] stringsArray = {"aaa", "bbb", "ccc"};

        stringsArrayInUpperCase(stringsArray);

        System.out.println(Arrays.toString(stringsArray));
    }
}
