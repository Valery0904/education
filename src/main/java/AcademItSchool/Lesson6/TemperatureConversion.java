package AcademItSchool.Lesson6;

import java.util.Scanner;

public class TemperatureConversion {
    public static double convertToKelvin(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }

    public static double convertToFahrenheit(double celsiusTemperature) {
        return celsiusTemperature * 1.8 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите температуру в градусах цельсия: ");
        double celsiusTemperature = scanner.nextDouble();

        double kelvinTemperature = convertToKelvin(celsiusTemperature);
        double fahrenheitTemperature = convertToFahrenheit(celsiusTemperature);

        System.out.printf("Температура в градусах Кельвина = %.2f%n", kelvinTemperature);
        System.out.printf("Температура в градусах Фаренгейта = %.2f", fahrenheitTemperature);
    }
}
