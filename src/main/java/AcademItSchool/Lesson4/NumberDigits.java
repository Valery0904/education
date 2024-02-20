package AcademItSchool.Lesson4;

import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число, сумму цифр, сумму нечетных цифр и максимальную цифру числа которого, " +
                "вы хотите найти: ");
        int number = scanner.nextInt();

        int digitsSum = 0;
        int oddDigitsSum = 0;
        int maxDigit = 0;

        while (number != 0) {
            int digit = number % 10;
            digitsSum += digit;

            if (digit % 2 != 0) {
                oddDigitsSum += digit;
            }

            if (maxDigit < digit) {
                maxDigit = digit;
            }

            number /= 10;
        }

        System.out.printf("Сумма цифр числа = %d%n", digitsSum);
        System.out.printf("Сумма нечетных цифр числа = %d%n", oddDigitsSum);
        System.out.printf("Максимальная цифра числа = %d%n", maxDigit);
    }
}
