package AcademItSchool.LessonThree;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double secondNumber = scanner.nextDouble();

        if (firstNumber == secondNumber) {
            System.out.println("Числа равны");
        } else if (firstNumber > secondNumber) {
            System.out.printf("Наибольшее = %.2f%nНаименьшее = %.2f%n", firstNumber, secondNumber);
        } else {
            System.out.printf("Наибольшее = %.2f%nНаименьшее = %.2f%n", secondNumber, firstNumber);
        }

        double max = (firstNumber > secondNumber) ? firstNumber : secondNumber;
        System.out.println("Наибольшее число = " + max);
    }
}
