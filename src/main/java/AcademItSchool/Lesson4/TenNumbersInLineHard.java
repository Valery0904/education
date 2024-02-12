package AcademItSchool.Lesson4;

public class TenNumbersInLineHard {
    public static void main(String[] args) {
        int startNumber = 3;
        int endNumber = 22;

        System.out.println("Введите количество чисел в строке: "); // Заменить на принт
        int numbersCountInLine = 6; //добавить сканер

        int i = startNumber;
        int numbersCount = 0;

        while (i <= endNumber) {
            numbersCount++;
            System.out.printf("%4d", i);

            if (numbersCount % numbersCountInLine == 0) {
                System.out.println();
            }

            i++;
        }
    }
}
