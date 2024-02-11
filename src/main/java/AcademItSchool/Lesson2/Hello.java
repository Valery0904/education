package AcademItSchool.Lesson2;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите свое имя:");
        String name = scanner.nextLine();

        System.out.println("Привет, " + name + "!");
    }
}