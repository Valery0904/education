package AcademItSchool.Lesson9;

import java.util.Arrays;

public class InvertedArray {
    public static int[] getInvertedArray(int[] array) {
        int[] invertedArray = new int[array.length];
        int arrayLength = array.length - 1;

        for (int i = 0; i <= array.length - 1; i++) {
            invertedArray[i] = array[arrayLength];
            arrayLength--;
        }

        return invertedArray;
    }

    public static void main(String[] args) {
        int[] array = {10, 9, 18, 11, 5, 36, 12, 52, 4, 1, 99};

        System.out.println("максимальное число в массиве = " + Arrays.toString(getInvertedArray(array)));
    }
}
