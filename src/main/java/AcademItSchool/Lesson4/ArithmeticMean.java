package AcademItSchool.Lesson4;

import java.util.Scanner;

public class ArithmeticMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите стартовое число: ");
        int startNumber = scanner.nextInt();

        System.out.print("Введите конечное число: ");
        int endNumber = scanner.nextInt();

        int i = startNumber;
        int sum = 0;
        int count = 0;
        int evenNumbersSum = 0;
        int evenNumbersCount = 0;

        while (i <= endNumber) {
            if (i % 2 == 0) {
                evenNumbersSum += i;
                evenNumbersCount++;
            }

            sum += i;
            ++count;
            ++i;
        }

        double average = (double) sum / count;
        double evenNumbersAverage = (double) evenNumbersSum / evenNumbersCount;
        System.out.println("Среднее арифметическое всех чисел = " + average);
        System.out.println("Среднее арифметическое четных чисел = " + evenNumbersAverage);
    }
}
