package AcademItSchool.Lesson9;

import java.util.Arrays;

public class InvertedArray {
    public static void invertArray(int[] array) {
        int arrayHalfLength = array.length / 2;

        for (int i = 0, j = array.length - 1; i < arrayHalfLength; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 9, 18, 11, 5, 36, 12, 52, 4, 1, 99};

        invertArray(array);

        System.out.println(Arrays.toString(array));
    }
}
