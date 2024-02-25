package AcademItSchool.Lesson8;

import java.util.Scanner;

public class CharactersCounting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String enteredString = scanner.nextLine();
        String string = enteredString.toLowerCase();

        int numberCount = 0;
        int letterCount = 0;
        int whitespaceCount = 0;
        int otherCharacterCount = 0;

        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                numberCount++;
            } else if (Character.isLetter(string.charAt(i))) {
                letterCount++;
            } else if (Character.isWhitespace(string.charAt(i))) {
                whitespaceCount++;
            } else {
                otherCharacterCount++;
            }
        }

        System.out.println("Кол-во чисел = " + numberCount);
        System.out.println("Кол-во букв = " + letterCount);
        System.out.println("Кол-во пробелов = " + whitespaceCount);
        System.out.println("Кол-во прочих символов = " + otherCharacterCount);
    }
}
