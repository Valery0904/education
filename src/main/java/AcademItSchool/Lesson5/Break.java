package AcademItSchool.Lesson5;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = "Угадай строку";

        while (true) {
            System.out.print("Введите строку: ");
            String enteredString = scanner.nextLine();

            if (enteredString.equals(string)) {
                System.out.println("Строка введена верно");
                break;
            }

            System.out.println("Строка введена неверно, попробуй еще");
        }
    }
}
