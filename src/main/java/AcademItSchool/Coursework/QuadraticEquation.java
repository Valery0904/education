package AcademItSchool.Coursework;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите коэффициент А: ");
        double a = scanner.nextDouble();

        System.out.print("Введите коэффициент B: ");
        double b = scanner.nextDouble();

        System.out.print("Введите коэффициент C: ");
        double c = scanner.nextDouble();

        final double EPSILON = 1.0e-10;

        if (Math.abs(a) < EPSILON) {
            if (Math.abs(b) < EPSILON) {
                if (Math.abs(c) < EPSILON) {
                    System.out.println("Уравнение имеет множество решений");
                } else {
                    System.out.println("Уравнение не имеет решения");
                }
            } else {
                double x = -c / b;
                System.out.printf("Корень x = %.2f", x);
            }
        } else {
            double discriminant = Math.pow(b, 2) - 4 * a * c;

            if (Math.abs(discriminant) < EPSILON) {
                double x = -b / (2 * a);
                System.out.printf("Корень x = %.2f", x);
            } else if (discriminant > 0) {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.printf("Корень x1 = %.2f%nКорень x2 = %.2f", x1, x2);
            } else {
                System.out.println("Корней нет!");
            }
        }
    }
}
