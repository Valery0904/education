package AcademItSchool.Lesson6;

public class Overload {
    public static int getTypeSize(byte number) {
        return 1;
    }

    public static int getTypeSize(short number) {
        return 2;
    }

    public static int getTypeSize(int number) {
        return 4;
    }

    public static int getTypeSize(float number) {
        return 4;
    }

    public static int getTypeSize(long number) {
        return 8;
    }

    public static int getTypeSize(double number) {
        return 8;
    }

    public static void main(String[] args) {
        byte byteNumber = 1;
        System.out.println("Количество байт, требуемых под переменную типа byte = " + getTypeSize(byteNumber) + " байт");

        short shortNumber = 5;
        System.out.println("Количество байт, требуемых под переменную типа short = " + getTypeSize(shortNumber) + " байта");

        int intNumber = 125;
        System.out.println("Количество байт, требуемых под переменную типа int = " + getTypeSize(intNumber) + " байта");

        float floatNumber = 5.5f;
        System.out.println("Количество байт, требуемых под переменную типа float = " + getTypeSize(floatNumber) + " байта");

        long longNumber = 3252445;
        System.out.println("Количество байт, требуемых под переменную типа long = " + getTypeSize(longNumber) + " байт");

        double doubleNumber = 325.45;
        System.out.println("Количество байт, требуемых под переменную типа double = " + getTypeSize(doubleNumber) + " байт");
    }
}
