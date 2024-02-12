package AcademItSchool.Lesson4;

import java.util.Scanner;

public class DigitsOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число, сумму чисел которого, вы хотите найти: ");
        int number = scanner.nextInt();
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.printf("Сумма чисел = %d%n%n", sum);

        System.out.print("Введите число, сумму четных чисел которого, вы хотите найти: ");
        number = scanner.nextInt();
        sum = 0;

        while (number != 0) {
            if (number % 2 == 0) {
                sum += number % 10;
            }
            number /= 10;
        }
        System.out.printf("Сумма четных чисел = %d%n%n", sum);

        System.out.print("Введите число, максимальную цифру которого, вы хотите найти: ");
        number = scanner.nextInt();
        int max = 0;

        while (number != 0) {
            if (max < number % 10) {
                max = number % 10;
            }
            number /= 10;
        }
        System.out.printf("Максимальная цифра числа = %d%n", max);
    }
}
