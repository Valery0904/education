package AcademItSchool.Lesson4;

import java.util.Scanner;

public class NumbersDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число, сумму цифр, сумму положительных цифр и максимальную цифру числа которого, " +
                "вы хотите найти: ");
        int number = scanner.nextInt();

        int digitsSum = 0;
        int positiveDigitsSum = 0;
        int maxDigit = 0;

        while (number != 0) {
            digitsSum += number % 10;

            if (number % 2 == 0) {
                positiveDigitsSum += number % 10;
            }

            if (maxDigit < number % 10) {
                maxDigit = number % 10;
            }

            number /= 10;
        }

        System.out.printf("Сумма чисел = %d%n", digitsSum);
        System.out.printf("Сумма четных чисел = %d%n", positiveDigitsSum);
        System.out.printf("Максимальная цифра числа = %d%n", maxDigit);
    }
}
