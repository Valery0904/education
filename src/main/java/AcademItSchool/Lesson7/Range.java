package AcademItSchool.Lesson7;

import java.util.Scanner;

public class Range {

    public static void main(String[] args) {
        Range range = new Range();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начало числового диапазона: ");
        range.setFrom(scanner.nextDouble());

        System.out.print("Введите конец числового диапазона: ");
        range.setTo(scanner.nextDouble());

        System.out.print("Введите число которое хотите проверить: ");
        double x = scanner.nextDouble();

        System.out.printf("Длина числовго диапазона от %.2f до %.2f = %.2f%n", range.getFrom(), range.getTo(), range.getLength());

        if (range.isInside(x)) {
            System.out.printf("Число %.2f принадлежит диапазону", x);
        } else {
            System.out.printf("Число %.2f не принадлежит диапазону", x);
        }
    }

    public final double epsilon = 1.0e-10;
    public double from;
    public double to;

    public Range() {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getLength() {
        return to - from;
    }

    public boolean isInside(double x) {
        return x - from > -epsilon && x - to < epsilon;
    }
}
