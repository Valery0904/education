package AcademItSchool.Lesson4;

import java.util.Scanner;

public class ArithmeticMeanDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите стартовое число: ");
        int startNumber = scanner.nextInt();

        System.out.print("Введите конечное число: ");
        int endNumber = scanner.nextInt();

        int i = startNumber;
        int sum = 0;
        int count = 0;

        do {
            sum += i;
            ++count;
            ++i;
        } while (i <= endNumber);

        double average = (double) sum / count;
        System.out.println("Средее арифметическое всех чисел = " + average);

        //Вычисляем сумму положительных чисел.
        int j = startNumber;
        int evenNumbersSum = 0;
        int evenNumbersCount = 0;

        do {
            if (j % 2 == 0) {
                evenNumbersSum += j;
                evenNumbersCount++;
            }

            j++;
        } while (j % 2 == 0);

        double evenNumbersAverage = (double) evenNumbersSum / evenNumbersCount;
        System.out.println("Средее арифметическое положительных чисел = " + evenNumbersAverage);
    }
}
