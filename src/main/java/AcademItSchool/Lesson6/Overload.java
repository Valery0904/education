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
        byte quantityBytesForByte = (byte) 1;
        System.out.println("Количество байт, требуемых под переменную типа byte = " + getTypeSize(quantityBytesForByte) + " байт");

        short quantityBytesForShort = (short) 5;
        System.out.println("Количество байт, требуемых под переменную типа short = " + getTypeSize(quantityBytesForShort) + " байта");

        int quantityBytesForInt = 125;
        System.out.println("Количество байт, требуемых под переменную типа int = " + getTypeSize(quantityBytesForInt) + " байта");

        float quantityBytesForFloat = (float) 5.5;
        System.out.println("Количество байт, требуемых под переменную типа float = " + getTypeSize(quantityBytesForFloat) + " байта");

        long quantityBytesForLong = 3252445;
        System.out.println("Количество байт, требуемых под переменную типа long = " + getTypeSize(quantityBytesForLong) + " байт");

        double quantityBytesForDouble = 325.45;
        System.out.println("Количество байт, требуемых под переменную типа double = " + getTypeSize(quantityBytesForDouble) + " байт");
    }
}
