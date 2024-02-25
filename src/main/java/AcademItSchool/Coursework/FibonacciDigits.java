package AcademItSchool.Coursework;

import java.util.Scanner;

public class FibonacciDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите индекс числа Фибоначчи: ");
        int fibonacciNumberIndex = scanner.nextInt();

        int fibonacciNumberIndex1 = 0;
        int fibonacciNumberIndex2 = 1;
        int fibonacciNumberNextIndex = 0;

        if (fibonacciNumberIndex == 1) {
            System.out.printf("Число Фибоначчи с индексом %d = %d%n", fibonacciNumberIndex, fibonacciNumberIndex1);
        } else if (fibonacciNumberIndex == 2) {
            System.out.printf("Число Фибоначчи с индексом %d = %d%n", fibonacciNumberIndex, fibonacciNumberIndex2);
        } else {
            for (int i = 2; i < fibonacciNumberIndex; ++i) {
                fibonacciNumberNextIndex = fibonacciNumberIndex1 + fibonacciNumberIndex2;

                fibonacciNumberIndex1 = fibonacciNumberIndex2;
                fibonacciNumberIndex2 = fibonacciNumberNextIndex;
            }

            System.out.printf("Число Фибоначчи с индексом %d = %d%n", fibonacciNumberIndex, fibonacciNumberNextIndex);
        }
    }
}
