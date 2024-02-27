package AcademItSchool.Coursework;

import java.util.Scanner;

public class MaximumSubstring {
    public static int getMaxSubstringLength(String string) {
        if (string.isEmpty()) { // Тут я сначала задал условие string.length() == 0, но idea подсвечивает ворнинг и предлагает заменить на isEmpty()
            return 0;
        }

        int maxSubstringLength = 0;
        int currentSubstringLength = 1;

        for (int i = 0; i < string.length() - 1; i++) {
            char symbol = string.charAt(i);
            char nextSymbol = string.charAt(i + 1);

            if (symbol == nextSymbol) {
                currentSubstringLength++;
            } else if (currentSubstringLength > maxSubstringLength) {
                maxSubstringLength = currentSubstringLength;
                currentSubstringLength = 1;
            } else {
                currentSubstringLength = 1;
            }
        }

        return Math.max(maxSubstringLength, currentSubstringLength);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String string = scanner.nextLine();

        System.out.println("Длина максимальной подстроки = " + getMaxSubstringLength(string));
    }
}
