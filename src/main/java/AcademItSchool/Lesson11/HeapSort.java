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
            int indexMaxElement = i;
            int indexLeftChild = 2 * i + 1;
            int indexRightChild = 2 * i + 2;

            if (indexLeftChild < arrayLength && array[indexLeftChild] > array[indexMaxElement]) {
                indexMaxElement = indexLeftChild;
            }

            if (indexRightChild < arrayLength && array[indexRightChild] > array[indexMaxElement]) {
                indexMaxElement = indexRightChild;
            }

            if (indexMaxElement == i) {
                break;
            }

            int temp = array[i];
            array[i] = array[indexMaxElement];
            array[indexMaxElement] = temp;

            i = indexMaxElement;
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 6, 5, 1, 3, 8, 10, 9, 4, 7};

        heapSort(array);

        System.out.println(Arrays.toString(array));
    }
}
