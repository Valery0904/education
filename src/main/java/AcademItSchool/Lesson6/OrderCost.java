package AcademItSchool.Lesson6;

import java.util.Scanner;

public class OrderCost {
    public static double getOrderCost(int product1Amount, double product1Price, int product2Amount, double product2Price) {
        final int productsAmountForDiscount = 10;
        final int orderCostForDiscount = 1000;

        int productsTotalAmount = product1Amount + product2Amount;
        double orderCost = (product1Amount * product1Price) + (product2Amount * product2Price);

        final double maxDiscount = 0.9;
        final double minDiscount = 0.95;

        if (productsTotalAmount >= productsAmountForDiscount && orderCost >= orderCostForDiscount) {
            return orderCost * maxDiscount;
        }

        if (productsTotalAmount >= productsAmountForDiscount || orderCost >= orderCostForDiscount) {
            return orderCost * minDiscount;
        }

        return orderCost;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество товара №1:");
        int product1Amount = scanner.nextInt();

        System.out.println("Введите стоимость единицы товара №1:");
        double product1Price = scanner.nextDouble();

        System.out.println("Введите количество товара №2:");
        int product2Amount = scanner.nextInt();

        System.out.println("Введите стоимость единицы товара №2:");
        double product2Price = scanner.nextDouble();

        double orderCost = getOrderCost(product1Amount, product1Price, product2Amount, product2Price);
        System.out.println("Стоимость вашего заказа составляет " + orderCost + " руб.");
    }
}
