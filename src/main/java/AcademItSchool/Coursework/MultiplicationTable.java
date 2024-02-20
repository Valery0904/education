package AcademItSchool.Coursework;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задайте размер таблицы");

        System.out.print("Введите начальное число: ");
        int startNumber = scanner.nextInt();

        System.out.print("Введите конечное число: ");
        int endNumber = scanner.nextInt();

        System.out.print("   |");

        for (int i = startNumber; i <= endNumber; i++) {
            System.out.printf("%4d", i);
        }

        System.out.println();

        for (int i = startNumber; i <= endNumber + 1; i++) {
            System.out.print("----");
        }

        System.out.println();

        for (int i = startNumber; i <= endNumber; i++) {
            System.out.printf("%2d |", i);

            for (int j = startNumber; j <= endNumber; j++) {
                System.out.printf("%4d", i * j);
            }

            System.out.println();
        }
    }
}
