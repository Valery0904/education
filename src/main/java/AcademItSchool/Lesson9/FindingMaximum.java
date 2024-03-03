package AcademItSchool.Lesson9;

public class FindingMaximum {
    public static int getMax(int[] array) {
        int maxNumber = array[0];

        for (int e : array) {
            if (e > maxNumber) {
                maxNumber = e;
            }
        }

        return maxNumber;
    }

    public static void main(String[] args) {
        int[] array = {10, 9, 18, 11, 5};

        System.out.println("максимальное число в массиве = " + getMax(array));
    }
}
