package AcademItSchool.Lesson11;

import java.util.Arrays;

public class HeapSortRecursively {
    public static void heapSort(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            sifting(array, array.length, i);
        }

        for (int i = array.length - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            sifting(array, i, 0);
        }
    }

    public static void sifting(int[] array, int arrayLength, int i) {
        int maxElement = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        if (leftChild < arrayLength && array[leftChild] > array[maxElement]) {
            maxElement = leftChild;
        }

        if (rightChild < arrayLength && array[rightChild] > array[maxElement]) {
            maxElement = rightChild;
        }

        if (maxElement != i) {
            int temp = array[i];
            array[i] = array[maxElement];
            array[maxElement] = temp;
            sifting(array, arrayLength, maxElement);
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 6, 5, 1, 3, 8, 10, 9, 4, 7};

        heapSort(array);

        System.out.println(Arrays.toString(array));
    }
}
