package AcademItSchool.Lesson5;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        String string = "Угадай строку";

        for (;;) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите строку: ");
            String newString = scanner.nextLine();

            if (newString.equals(string)) {
                System.out.print("Строка введена верно");
                break;
            }
        }
    }
}
