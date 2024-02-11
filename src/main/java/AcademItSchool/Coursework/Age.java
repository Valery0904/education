package AcademItSchool.Coursework;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите ваш возраст");
        int age = scanner.nextInt();

        int ageLastDigit = age % 10;

        if (age < 1) {
            System.out.println("Вы слишком малы!");
        } else if (age > 112) {
            System.out.println("Вы слишком стары!");
        } else if (age % 100 >= 11 && age % 100 <= 14) {
            System.out.printf("Вам %d лет%n", age);
        } else if (ageLastDigit == 1) {
            System.out.printf("Вам %d год%n", age);
        } else if (ageLastDigit >= 2 && ageLastDigit <= 4) {
            System.out.printf("Вам %d года%n", age);
        } else {
            System.out.printf("Вам %d лет%n", age);
        }
    }
}

