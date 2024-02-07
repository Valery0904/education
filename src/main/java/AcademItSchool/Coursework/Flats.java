package AcademItSchool.Coursework;

import java.util.Scanner;

public class Flats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество этажей:");
        int floorsCount = scanner.nextInt();

        System.out.println("Введите количество подъездов:");
        int entrancesCount = scanner.nextInt();

        System.out.println("Введите номер квартиры:");
        int flatNumber = scanner.nextInt();

        int flatsCountOnFloor = 4;

        if (flatNumber <= 0 || flatNumber > floorsCount * entrancesCount * flatsCountOnFloor) {
            System.out.println("Такой квартиры не существует!");
        } else {
            int entranceNumber = (int) Math.ceil((double) flatNumber / flatsCountOnFloor / floorsCount);
            int floorNumber = (int) Math.ceil((double) flatNumber / flatsCountOnFloor) - (entranceNumber - 1) * floorsCount;

            System.out.printf("Квартира №%d находится в подъезде №%d на %d этаже, ", flatNumber, entranceNumber, floorNumber);

            int flatPosition = flatNumber % flatsCountOnFloor;

            if (flatPosition == 1) {
                System.out.println("ближняя слева.");
            } else if (flatPosition == 2) {
                System.out.println("дальняя слева.");
            } else if (flatPosition == 3) {
                System.out.println("дальняя справа.");
            } else {
                System.out.println("ближняя справа.");
            }
        }
    }
}