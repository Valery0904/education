package AcademItSchool.Lesson10;

import java.util.Scanner;

public class EuclideanAlgorithmRecursively {
    public static int getGreatestCommonDivisorRecursively(int number1, int number2) {
        return number2 == 0 ? number1 : getGreatestCommonDivisorRecursively(number2, number1 % number2);
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
            System.out.printf("НОД: %d", getGreatestCommonDivisorRecursively(number1, number2));
        }
    }
}
