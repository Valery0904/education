package AcademItSchool.Coursework;

import java.util.Scanner;

public class NextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите день: ");
        int day = scanner.nextInt();

        System.out.print("Введите месяц: ");
        int month = scanner.nextInt();

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        int daysInMonthAmount = 31;
        boolean isLeapYear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysInMonthAmount = 30;
        } else if (month == 2) {
            if (isLeapYear) {
                daysInMonthAmount = 29;
            } else {
                daysInMonthAmount = 28;
            }
        }

        if ((day < 1 || day > daysInMonthAmount) || (month < 1 || month > 12) || year < 1) {
            System.out.println("Введенной даты не существует!");
            return;
        }

        int nextDay = day + 1;
        int nextMonth = month;
        int nextYear = year;

        if (nextDay > daysInMonthAmount) {
            nextDay = 1;
            nextMonth++;
        }

        if (nextMonth > 12) {
            nextMonth = 1;
            nextYear++;
        }

        System.out.printf("Следующая дата: %02d.%02d.%d", nextDay, nextMonth, nextYear);
    }
}
