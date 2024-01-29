package academItSchool.coursework;

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

        //TODO: Придумать названия переменным
        boolean a = flatNumber <= 0;
        boolean b = flatNumber > floorsCount * entrancesCount * flatsCountOnFloor;

        if (a || b) {
            System.out.println("Такой квартиры не существует!");
        }
    }
}
