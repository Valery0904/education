package AcademItSchool.Coursework;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите координату х1 для точки А: ");
        double x1 = scanner.nextDouble();
        System.out.print("Введите координату y1 для точки A: ");
        double y1 = scanner.nextDouble();

        System.out.print("Введите координату x2 для точки B: ");
        double x2 = scanner.nextDouble();
        System.out.print("Введите координату y2 для точки B: ");
        double y2 = scanner.nextDouble();

        System.out.print("Введите координату x3 для точки C: ");
        double x3 = scanner.nextDouble();
        System.out.print("Введите координату y3 для точки C: ");
        double y3 = scanner.nextDouble();

        double epsilon = 1.0e-10;

        if (Math.abs((x2 - x1) * (y3 - y1) - (y2 - y1) * (x3 - x1)) <= epsilon) {
            System.out.println("Точки лежат на одной прямой");
        } else {
            double cutAbLength = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            double cutBcLength = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
            double cutCaLength = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

            double halfPerimeter = (cutAbLength + cutBcLength + cutCaLength) / 2;
            double triangleArea = Math.sqrt(halfPerimeter * (halfPerimeter - cutAbLength) * (halfPerimeter -
                    cutBcLength) * (halfPerimeter - cutCaLength));

            System.out.printf("Длина отрезка AB = %.2f%nДлина отрезка BC = %.2f%nДлина отрезка CA = %.2f%n", cutAbLength,
                    cutBcLength, cutCaLength);
            System.out.printf("Площадь треугольника = %.2f", triangleArea);
        }
    }
}
