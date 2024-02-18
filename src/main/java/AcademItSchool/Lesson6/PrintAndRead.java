package AcademItSchool.Lesson6;

import java.util.Scanner;

public class PrintAndRead {

    public static int printAndRead(String line) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(line);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int number = printAndRead("Введите число: ");
        System.out.println("Введенное число: " + number);

        int sum = printAndRead("Введите число, которое будет результатом сложения числа 5 и числа 3: ");
        System.out.println("5 + 3 = " + sum);

        int birthYear = printAndRead("Введите свой год рождкния: ");
        System.out.println("Вы роодились в " + birthYear);
    }
}
