package AcademItSchool.Coursework;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите индекс числа Фибоначчи: ");
        int fibonacciNumberIndex = scanner.nextInt();

        if (fibonacciNumberIndex == 1 || fibonacciNumberIndex == 2) {
            System.out.printf("Число Фибоначчи с индексом %d = %d%n", fibonacciNumberIndex, 1);
        } else {
            int previousFibonacciNumber = 0;
            int currentFibonacciNumber = 1;
            int nextFibonacciNumber = 0;

            for (int i = 2; i <= fibonacciNumberIndex; ++i) {
                nextFibonacciNumber = previousFibonacciNumber + currentFibonacciNumber;
                previousFibonacciNumber = currentFibonacciNumber;
                currentFibonacciNumber = nextFibonacciNumber;
            }

            System.out.printf("Число Фибоначчи с индексом %d = %d%n", fibonacciNumberIndex, nextFibonacciNumber);
        }
    }
}
