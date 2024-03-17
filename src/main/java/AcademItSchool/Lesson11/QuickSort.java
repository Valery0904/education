package AcademItSchool.Lesson11;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivot = array[left];

        int i = left;
        int j = right;

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                i++;
                j--;
            }
        }

        if (left < j) {
            quickSort(array, left, j);
        }

        if (right > i) {
            quickSort(array, i, right);
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 10, 3, 2, 6, 8, 14, 7};

        quickSort(array, 0, array.length - 1);

        System.out.println(Arrays.toString(array));
    }
}
