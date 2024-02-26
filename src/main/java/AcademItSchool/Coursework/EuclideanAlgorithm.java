package AcademItSchool.Coursework;

import java.util.Scanner;

public class EuclideanAlgorithm {
    public static int getGcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("Оба числа равны нулю, НОД искать нельзя");
        } else {
            System.out.printf("НОД: %d", getGcd(a, b));
        }
    }
}
