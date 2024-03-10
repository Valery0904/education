package AcademItSchool.Lesson9;

import java.util.Arrays;

public class InvertedArray {
    public static int[] getInvertedArray(int[] array) {
        int arrayHalf = array.length / 2;

        for (int i = 0, j = array.length - 1; i < arrayHalf; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = {10, 9, 18, 11, 5, 36, 12, 52, 4, 1, 99};
        System.out.println(Arrays.toString(getInvertedArray(array)));
    }
}
