package AcademItSchool.Coursework;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearchRecursively(int[] array, int number, int left, int right) {
        if (left > right) {
            return -1;
        }

        int middle = (left + right) / 2;

        if (number == array[middle]) {
            return middle;
        }

        if (number > array[middle]) {
            return binarySearchRecursively(array, number, middle + 1, right);
        }

        return binarySearchRecursively(array, number, left, middle - 1);
    }

    public static int binarySearch(int[] array, int number) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (number == array[middle]) {
                return middle;
            } else if (number > array[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        System.out.print("Введите число индекс которого хотите найти: ");
        int number = scanner.nextInt();

        System.out.printf("Индекс числа %d = %d%n", number, binarySearch(array, number));
        System.out.printf("Индекс числа %d = %d", number, binarySearchRecursively(array, number, 0, array.length - 1));
    }
}
