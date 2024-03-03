package AcademItSchool.Lesson9;

import java.util.Scanner;

public class SearchElement {
    public static int getIndex(int number, int[] array) {
        for (int i = 0; i <= array.length - 1; i++) {
            if (number == array[i]) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число индекс которого хотите узнать: ");
        int number = scanner.nextInt();

        int[] array = {10, 9, 18, 11, 5};

        System.out.printf("Индекс числа %d = %d", number, getIndex(number, array));
    }
}
