package AcademItSchool.Lesson3;

import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = "password#123";

        System.out.println("Введите пароль:");
        String enteredPassword = scanner.nextLine();

        if (enteredPassword.equals(password)) {
            System.out.println("Пароль верный");
        } else if (enteredPassword.length() < password.length()) {
            System.out.println("Пароль неверный, слишком короткий пароль");
        } else if (enteredPassword.length() > password.length()) {
            System.out.println("Пароль неверный, слишком длинный пароль");
        } else {
            System.out.println("Пароль неверный");
        }
    }
}
