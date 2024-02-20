package AcademItSchool.Coursework;

import java.util.Scanner;

public class Deposit {
    public static double getDepositCalculation(double initialDeposit, int monthCount, double yearInterestRate) {
        final int percent = 100;

        double monthInterestRate = yearInterestRate / percent / 12;
        double currentDeposit = initialDeposit;

        for (int i = 1; i <= monthCount; i++) {
            double monthProfit = currentDeposit * monthInterestRate;
            currentDeposit += monthProfit;
        }

        return currentDeposit;
    }

    public static double getProfit(double initialDeposit, double currentDeposit) {

        return currentDeposit - initialDeposit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму, которую хотите внести: ");
        double initialDeposit = scanner.nextDouble();

        System.out.print("Введите срок (в месяцах): ");
        int monthCount = scanner.nextInt();

        System.out.print("Введите годовую процентную ставку: ");
        double yearInterestRate = scanner.nextDouble();

        double currentDeposit = getDepositCalculation(initialDeposit, monthCount, yearInterestRate);
        System.out.printf("Сумма банковского вклада на конец периода составит: %.2f%n", currentDeposit);

        double profit = getProfit(initialDeposit, currentDeposit);
        System.out.printf("Ваша прибыль составит: %.2f", profit);
    }
}
