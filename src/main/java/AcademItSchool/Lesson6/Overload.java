package AcademItSchool.Lesson6;

public class Overload {
    public static int getTypeSize(byte a) {
        return 1;
    }

    public static int getTypeSize(short a) {
        return 2;
    }

    public static int getTypeSize(int a) {
        return 4;
    }

    public static int getTypeSize(float a) {
        return 4;
    }

    public static int getTypeSize(long a) {
        return 8;
    }

    public static int getTypeSize(double a) {
        return 8;
    }

    public static void main(String[] args) {
        byte a = (byte) 1;
        System.out.println("Количество байт, требуемых под переменную типа byte = " + getTypeSize(a) + " байт");

        short b = (short) 5;
        System.out.println("Количество байт, требуемых под переменную типа short = " + getTypeSize(b) + " байта");

        int c = 125;
        System.out.println("Количество байт, требуемых под переменную типа int = " + getTypeSize(c) + " байта");

        float d = (float) 5.5;
        System.out.println("Количество байт, требуемых под переменную типа float = " + getTypeSize(d) + " байта");

        long e = 3252445;
        System.out.println("Количество байт, требуемых под переменную типа long = " + getTypeSize(e) + " байт");

        double f = 325.45;
        System.out.println("Количество байт, требуемых под переменную типа double = " + getTypeSize(f) + " байт");
    }
}
