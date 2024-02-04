package AcademItSchool.LessonTwo;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ведите длину прямоугольника:");
        double rectangleLength = scanner.nextDouble();

        System.out.println("Ведите ширину прямоугольника:");
        double rectangleWidth = scanner.nextDouble();

        double rectangleArea = rectangleLength * rectangleWidth;
        double rectanglePerimeter = 2 * (rectangleLength + rectangleWidth);

        System.out.printf("Длина = %.2f%n", rectangleLength);
        System.out.printf("Ширина = %.2f%n", rectangleWidth);
        System.out.printf("Площадь прямоугольника = %.2f%n", rectangleArea);
        System.out.printf("Периметр прямоугольника = %.2f", rectanglePerimeter);
    }
}