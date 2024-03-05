package AcademItSchool.Lesson9;

public class ArrayArithmeticMean {
    public static double getEvenNumbersArithmeticMean(int[] array) {
        int evenNumbersSum = 0;
        int evenNumbersCount = 0;

        for (int e : array) {
            if (e % 2 == 0) {
                evenNumbersSum += e;
                evenNumbersCount++;
            }
        }

        return (double) evenNumbersSum / evenNumbersCount;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};

        System.out.println("Среднее арифметическое четных чисел = " + getEvenNumbersArithmeticMean(array));
    }
}
