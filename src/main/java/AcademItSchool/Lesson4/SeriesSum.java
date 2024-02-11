package AcademItSchool.Lesson4;

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите кол-во чисел в серии: ");
        int sequenceNumbersQuantity = scanner.nextInt();

        int i = 1;
        int sum = 0;

        while (i <= sequenceNumbersQuantity) {
            if (i % 2 == 0) {
                sum -= (int) Math.pow(i, 2);
            } else {
                sum += (int) Math.pow(i, 2);
            }
            i++;
        }

        System.out.println("Сумма чисел в серии6: " + sum);
    }
}
