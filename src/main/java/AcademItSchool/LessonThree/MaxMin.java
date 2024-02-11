package AcademItSchool.LessonThree;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int numberOne = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int numberTwo = scanner.nextInt();

        if (numberOne == numberTwo) {
            System.out.println("Числа равны");
        } else if (numberOne > numberTwo) {
            System.out.printf("Наибольшее число = %.2f%nНаименьшее число = %.2f%n", numberOne, numberTwo);
        } else {
            System.out.printf("Наибольшее число = %.2f%nНаименьшее число = %.2f%n", numberTwo, numberOne);
        }

        double max = (numberOne > numberTwo) ? numberOne : numberTwo;
        double min = (numberOne < numberTwo) ? numberOne : numberTwo;
        System.out.printf("Наибольшее число = %.2f%nНаименьшее число = %.2f%n", max, min);
    }
}
