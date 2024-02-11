package AcademItSchool.Lesson3;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();

        if (number1 == number2) {
            System.out.println("Числа равны");
        } else if (number1 > number2) {
            System.out.printf("Наибольшее число = %d%nНаименьшее число = %d%n", number1, number2);
        } else {
            System.out.printf("Наибольшее число = %d%nНаименьшее число = %d%n", number2, number1);
        }

        int max = (number1 > number2) ? number1 : number2;
        int min = (number1 < number2) ? number1 : number2;
        System.out.printf("Наибольшее число = %d%nНаименьшее число = %d%n", max, min);
    }
}
