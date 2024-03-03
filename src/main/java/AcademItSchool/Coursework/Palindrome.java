package AcademItSchool.Coursework;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String string) {

        for (int i = 0, j = string.length() - 1; i < j; i++, j--) {
            if(!Character.isLetter(string.charAt(i))) {
                j++;
                continue;
            }

            if (!Character.isLetter(string.charAt(j))){
                i--;
                continue;
            }

            if (string.charAt(i) != string.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String string = scanner.nextLine().toLowerCase();

        boolean stringIsPalindrome = isPalindrome(string);

        if (stringIsPalindrome) {
            System.out.println("Строка является палиндромом.");
        } else {
            System.out.println("Строка не является палиндромом.");
        }
    }
}
