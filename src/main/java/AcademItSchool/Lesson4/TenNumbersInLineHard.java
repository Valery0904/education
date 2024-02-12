package AcademItSchool.Lesson4;

import java.util.Scanner;

public class TenNumbersInLineHard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальное число: ");
        int startNumber = scanner.nextInt();

        System.out.print("Введите конечное число: ");
        int endNumber = scanner.nextInt();

        System.out.print("Введите количество чисел в строке: ");
        int numbersCountInLine = scanner.nextInt();

        int i = startNumber;
        int numbersCount = 0;

        while (i <= endNumber) {
            numbersCount++;
            System.out.printf("%4d", i);

            if (numbersCount % numbersCountInLine == 0) {
                System.out.println();
            }

            i++;
        }
    }
}
