package AcademItSchool.Lesson8;

import java.util.Scanner;

public class CharactersCounting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String enteredString = scanner.nextLine();

        int digitsCount = 0;
        int lettersCount = 0;
        int whitespacesCount = 0;
        int otherCharactersCount = 0;

        for (int i = 0; i < enteredString.length(); i++) {
            char symbol = enteredString.charAt(i);

            if (Character.isDigit(symbol)) {
                digitsCount++;
            } else if (Character.isLetter(symbol)) {
                lettersCount++;
            } else if (Character.isWhitespace(symbol)) {
                whitespacesCount++;
            } else {
                otherCharactersCount++;
            }
        }

        System.out.println("Кол-во чисел = " + digitsCount);
        System.out.println("Кол-во букв = " + lettersCount);
        System.out.println("Кол-во пробелов = " + whitespacesCount);
        System.out.println("Кол-во прочих символов = " + otherCharactersCount);
    }
}
