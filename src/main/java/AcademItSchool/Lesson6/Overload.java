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
        byte typeByte = 1;
        System.out.println("Количество байт, требуемых под переменную типа byte = " + getTypeSize(typeByte) + " байт");

        short typeShort = 5;
        System.out.println("Количество байт, требуемых под переменную типа short = " + getTypeSize(typeShort) + " байта");

        int typeInt = 125;
        System.out.println("Количество байт, требуемых под переменную типа int = " + getTypeSize(typeInt) + " байта");

        float typeFloat = 5.5f;
        System.out.println("Количество байт, требуемых под переменную типа float = " + getTypeSize(typeFloat) + " байта");

        long typeLong = 3252445;
        System.out.println("Количество байт, требуемых под переменную типа long = " + getTypeSize(typeLong) + " байт");

        double typeDouble = 325.45;
        System.out.println("Количество байт, требуемых под переменную типа double = " + getTypeSize(typeDouble) + " байт");
    }
}
