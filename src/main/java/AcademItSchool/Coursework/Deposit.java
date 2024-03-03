package AcademItSchool.Coursework;

import java.util.Scanner;

public class Deposit {
    public static double getCurrentDeposit(double initialDeposit, int monthsCount, double yearInterestRate) {
        final int hundredPercent = 100;
        final int monthsInYearCount = 12;

        double monthInterestRate = yearInterestRate / hundredPercent / monthsInYearCount;
        double currentDeposit = initialDeposit;

        for (int i = 1; i <= monthsCount; i++) {
            double monthProfit = currentDeposit * monthInterestRate;
            currentDeposit += monthProfit;
        }

        return currentDeposit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму, которую хотите внести: ");
        double initialDeposit = scanner.nextDouble();

        System.out.print("Введите срок (в месяцах): ");
        int monthsCount = scanner.nextInt();

        System.out.print("Введите годовую процентную ставку: ");
        double yearInterestRate = scanner.nextDouble();

        double currentDeposit = getCurrentDeposit(initialDeposit, monthsCount, yearInterestRate);
        System.out.printf("Сумма банковского вклада на конец периода составит: %.2f%n", currentDeposit);

        double profit = currentDeposit - initialDeposit;
        System.out.printf("Ваша прибыль составит: %.2f", profit);
    }
}
