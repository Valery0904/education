package AcademItSchool.Lesson9;

public class ArithmeticMeanArray {
    public static double getArithmeticMean(int[] array) {
        int evenNumbersSum = 0;
        int evenNumbersCount = 0;

        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] % 2 == 0) {
                evenNumbersSum += array[i];
                evenNumbersCount++;
            }
        }

        return (double) evenNumbersSum / evenNumbersCount;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};

        System.out.println("Среднее арифметическое четных чисел = " + getArithmeticMean(array));
    }
}
