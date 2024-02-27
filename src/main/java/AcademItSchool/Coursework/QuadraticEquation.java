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

        final double epsilon = 1.0e-10;

        if (Math.abs(a) <= epsilon && Math.abs(b) <= epsilon) {
            System.out.println("Коренем является любое число");
        } else if (Math.abs(b) <= epsilon && Math.abs(c) <= epsilon) {
            System.out.println("Корень x = 0");
        } else if (Math.abs(a) <= epsilon) {
            double x = -c / b;
            System.out.printf("Корень x = %.2f", x);
        } else if (Math.abs(c) <= epsilon) {
            double x1 = 0;
            double x2 = -b / a;
            System.out.printf("Корни:%nx1 = %.2f%nx2 = %.2f", x1, x2);
        } else if (Math.abs(b) <= epsilon) {
            if ((-c / a) <= epsilon) {
                System.out.println("Корней нет");
            } else {
                double x1 = Math.sqrt(-c / a);
                double x2 = -Math.sqrt(-c / a);
                System.out.printf("Корни:%nx1 = %.2f%nx2 = %.2f", x1, x2);
            }
        } else {
            double discriminant = Math.pow(b, 2) - 4 * a * c;

            if (discriminant < epsilon) {
                System.out.println("Корней нет!");
            } else if (discriminant == epsilon) {
                double x = -b / (2 * a);
                System.out.printf("Корень x = %.2f", x);
            } else {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.printf("Корень x1 = %.2f%nКорень x2 = %.2f", x1, x2);
            }
        }
    }
}
