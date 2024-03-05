package AcademItSchool.Lesson9;

public class FindingMax {
    public static double getMax(double[] array) {
        double maxNumber = array[0];

        for (double e : array) {
            if (e > maxNumber) {
                maxNumber = e;
            }
        }

        return maxNumber;
    }

    public static void main(String[] args) {
        double[] array = {10.6, 9.2, 18.1, 11.7, 5.0};
        System.out.println("Максимальное число в массиве = " + getMax(array));
    }
}
