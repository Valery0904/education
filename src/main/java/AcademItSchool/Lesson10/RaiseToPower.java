package AcademItSchool.Lesson10;

import java.util.Scanner;

public class RaiseToPower {
    public static int raiseToPower(int number, int power) {
        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        return result;
    }

    public static int raiseToPowerRecursively(int number, int power) {
        if (power == 0) {
            return 1;
        }

        return raiseToPowerRecursively(number, power - 1) * number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        System.out.print("Введите степень: ");
        int power = scanner.nextInt();

        System.out.printf("Число %d в степени %d = %d%n", number, power, raiseToPower(number, power));
        System.out.printf("Число %d в степени %d = %d%n", number, power, raiseToPowerRecursively(number, power));
    }
}
