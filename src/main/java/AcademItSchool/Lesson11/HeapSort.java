package AcademItSchool.Lesson11;

import java.util.Arrays;

public class HeapSort {
    private static void heapSort(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            sift(array, array.length, i);
        }

        for (int i = array.length - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            sift(array, i, 0);
        }
    }

    public static void sift(int[] array, int arrayLength, int i) {
        while (true) {
            int maxElementIndex = i;
            int leftChildIndex = 2 * i + 1;
            int rightChildIndex = 2 * i + 2;

            if (leftChildIndex < arrayLength && array[leftChildIndex] > array[maxElementIndex]) {
                maxElementIndex = leftChildIndex;
            }

            if (rightChildIndex < arrayLength && array[rightChildIndex] > array[maxElementIndex]) {
                maxElementIndex = rightChildIndex;
            }

            if (maxElementIndex == i) {
                return;
            }

            int temp = array[i];
            array[i] = array[maxElementIndex];
            array[maxElementIndex] = temp;

            i = maxElementIndex;
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 6, 5, 1, 3, 8, 10, 9, 4, 7};

        heapSort(array);

        System.out.println(Arrays.toString(array));
    }
}
