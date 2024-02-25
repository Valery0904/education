package AcademItSchool.Coursework;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return min + random.nextInt((max - min) + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 1;
        int max = 100;

        System.out.printf("Угадай число которое я загадал! Загаданное число находится в диапазоне от %d до %d%n", min, max);
        int randomNumber = generateRandomNumber(min, max);

        int attemptsQuantity = 1;

        while (true) {
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
