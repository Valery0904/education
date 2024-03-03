package AcademItSchool.Lesson10;

import java.util.Scanner;

public class RaiseToPower {
    public static int raiseToPowerNonRecursively(int number, int pow) {
        if (pow == 0) {
            return 1;
        }

        int result = number;

        for (int i = 1; i < pow; i++) {
            result *= number;
        }

        return result;
    }

    public static int raiseToPowerRecursively(int number, int pow) {
        if (pow == 0) {
            return 1;
        }

        return raiseToPowerRecursively(number, pow - 1) * number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        System.out.print("Введите степень: ");
        int pow = scanner.nextInt();

        System.out.printf("Число %d в степени %d = %d%n", number, pow, raiseToPowerNonRecursively(number, pow));
        System.out.printf("Число %d в степени %d = %d%n", number, pow, raiseToPowerRecursively(number, pow));
    }
}
