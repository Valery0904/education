package AcademItSchool.Lesson11;

import java.util.Arrays;

public class HeapSorting {
    public static void heapSort(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            sifting(array, array.length, i);
        }

        for (int i = array.length - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            sifting(array, i, 0);
        }
    }

    public static void sifting(int[] array, int lengthArray, int i) {
        int greatestElement = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < lengthArray && array[left] > array[greatestElement]) {
            greatestElement = left;
        }

        if (right < lengthArray && array[right] > array[greatestElement]) {
            greatestElement = right;
        }

        if (greatestElement != i) {
            int temp = array[i];
            array[i] = array[greatestElement];
            array[greatestElement] = temp;
            sifting(array, lengthArray, greatestElement);
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 6, 5, 1, 3, 8, 10, 9, 4, 7};

        heapSort(array);

        System.out.println(Arrays.toString(array));
    }
}
