package AcademItSchool.Coursework;

import java.util.Scanner;

public class FibonacciDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов числовой последовательности Фибоначчи: ");
        int countFibonacciDigits = scanner.nextInt();

        int fibonacciSequenceFirstNumber = 0;
        int fibonacciSequenceSecondNumber = 1;

        System.out.printf("%d %d", fibonacciSequenceFirstNumber, fibonacciSequenceSecondNumber);

        for (int i = 2; i < countFibonacciDigits; ++i) {
            int fibonacciSequenceNextNumber = fibonacciSequenceFirstNumber + fibonacciSequenceSecondNumber;
            System.out.printf(" %d", fibonacciSequenceNextNumber);
            fibonacciSequenceFirstNumber = fibonacciSequenceSecondNumber;
            fibonacciSequenceSecondNumber = fibonacciSequenceNextNumber;
        }
    }
}
