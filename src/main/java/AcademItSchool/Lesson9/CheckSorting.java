package AcademItSchool.Lesson9;

public class CheckSorting {
    public static boolean isSortedAscending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isSortedDescending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arraySortedAscending = new int[]{1, 2, 3, 4, 5};

        if (isSortedAscending(arraySortedAscending)) {
            System.out.println("Массив отсортирован по возрастанию");
        } else {
            System.out.println("Массив неотсортирован");
        }

        int[] arraySortedDescending = new int[]{5, 4, 3, 2, 1};

        if (isSortedDescending(arraySortedDescending)) {
            System.out.println("Массив отсортирован по убыванию");
        } else {
            System.out.println("Массив неотсортирован");
        }
    }
}
