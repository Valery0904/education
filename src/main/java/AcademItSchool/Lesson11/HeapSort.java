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
        int indexMaxElement = i;
        int indexLeftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        while (indexLeftChild < arrayLength || rightChild < arrayLength) {

            if (indexLeftChild < arrayLength && array[indexLeftChild] > array[indexMaxElement]) {
                indexMaxElement = indexLeftChild;
            }

            if (rightChild < arrayLength && array[rightChild] > array[indexMaxElement]) {
                indexMaxElement = rightChild;
            }

            if (indexMaxElement != i) {
                int temp = array[i];
                array[i] = array[indexMaxElement];
                array[indexMaxElement] = temp;

                i = indexMaxElement;
                indexLeftChild = 2 * i + 1;
                rightChild = 2 * i + 2;
            } else {
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 6, 5, 1, 3, 8, 10, 9, 4, 7};

        heapSort(array);

        System.out.println(Arrays.toString(array));
    }
}
