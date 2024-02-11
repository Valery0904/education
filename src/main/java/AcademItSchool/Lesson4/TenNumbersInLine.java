package AcademItSchool.Lesson4;

public class TenNumbersInLine {
    public static void main(String[] args) {
        int startNumber = 1;
        int endNumber = 100;
        int i = startNumber;

        while (i <= endNumber) {
            System.out.printf("%4d", i);

            if (i % 10 == 0) {
                System.out.println();
            }

            i++;
        }
    }
}
