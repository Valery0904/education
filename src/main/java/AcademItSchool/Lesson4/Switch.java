package AcademItSchool.Lesson4;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();

        System.out.print("Введите код команды от 1 до 4: ");
        int commandCode = scanner.nextInt();

        switch (commandCode) {
            case 1:
                System.out.println(number1 + number2);
                break;
            case 2:
                System.out.println(number1 - number2);
                break;
            case 3:
                System.out.println(number1 * number2);
                break;
            case 4:
                System.out.println(number1 / number2);
                break;
            default:
                System.out.println("Код команды неверный");
        }
    }
}
