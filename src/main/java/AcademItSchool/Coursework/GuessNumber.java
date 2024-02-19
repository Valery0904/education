package AcademItSchool.Coursework;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Угадай число которое я загадал! Загаданное число находится в диапазоне от 1 до 100");
        int randomNumber = random.nextInt(100);

        int attemptsQuantity = 1;

        for (; ; ) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введи свое число: ");
            int number = scanner.nextInt();

            if (number < randomNumber) {
                System.out.println("Загаданное число больше! Попробуй еще раз");
            } else if (number > randomNumber) {
                System.out.println("Загаданное число меньше! Попробуй еще раз");
            } else {
                System.out.println("Ты угадал загаданное число " + number + " с " + attemptsQuantity + " попытки");
                break;
            }

            attemptsQuantity++;
        }
    }
}
