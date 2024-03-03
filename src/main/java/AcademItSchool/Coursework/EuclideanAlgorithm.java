package AcademItSchool.Coursework;

import java.util.Scanner;

public class EuclideanAlgorithm {
    public static int getGreatestCommonDivisor(int number1, int number2) {
        while (number2 != 0) {
            int temp = number1 % number2;
            number1 = number2;
            number2 = temp;
        }

        return number1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();

        if (number1 == 0 && number2 == 0) {
            System.out.println("Оба числа равны нулю, НОД искать нельзя");
        } else {
            System.out.printf("НОД: %d", getGreatestCommonDivisor(number1, number2));
        }
    }
}
