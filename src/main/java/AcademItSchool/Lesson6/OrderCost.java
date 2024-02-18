package AcademItSchool.Lesson6;

import java.util.Scanner;

public class OrderCost {

    public static double getOrderCost(int product1Amount, double product1Price, int product2Amount, double product2Price) {
        final double maxDiscount = 0.9;
        final double minDiscount = 0.95;
        final int productsAmountForDiscount = 10;
        final int orderCostForDiscount = 1000;

        int productsTotalAmount = product1Amount + product2Amount;
        double orderCost = (product1Amount * product1Price) + (product2Amount * product2Price);

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

        System.out.println("Введите количество товара №1: ");
        int products1Amount = scanner.nextInt();

        System.out.println("Введите стоимость единицы товара №1: ");
        double product1Price = scanner.nextInt();

        System.out.println("Введите количество товара №2: ");
        int products2Amount = scanner.nextInt();

        System.out.println("Введите стоимость единицы товара №2: ");
        double product2Price = scanner.nextInt();

        double orderCost = getOrderCost(products1Amount, product1Price, products2Amount, product2Price);
        System.out.println("Стоимость вашего заказа составляет " + orderCost + " руб.");
    }
}
