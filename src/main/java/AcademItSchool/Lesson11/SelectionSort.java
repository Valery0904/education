package AcademItSchool.Lesson11;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minElementIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minElementIndex]) {
                    minElementIndex = j;
                }
            }

            int temp = array[minElementIndex];
            array[minElementIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 6, 5, 1, 3, 8, 10, 9, 4, 7};

        selectionSort(array);

        System.out.println(Arrays.toString(array));
    }
}
