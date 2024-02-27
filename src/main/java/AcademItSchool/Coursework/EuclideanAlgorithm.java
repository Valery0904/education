package AcademItSchool.Coursework;

import java.util.Scanner;

public class EuclideanAlgorithm {
    public static int getGreatestCommonDivisor(int firstNumber, int secondNumber) {
        while (secondNumber != 0) {
            int temp = firstNumber % secondNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }

        return firstNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber == 0 && secondNumber == 0) {
            System.out.println("Оба числа равны нулю, НОД искать нельзя");
        } else {
            System.out.printf("НОД: %d", getGreatestCommonDivisor(firstNumber, secondNumber));
        }
    }
}
