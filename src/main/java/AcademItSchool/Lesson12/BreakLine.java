package AcademItSchool.Lesson12;

public class BreakLine {
    public static int getNumbersSumInString (String numbersString){
        String delimiter = ", ";
        String[] numbersStrings = numbersString.split(delimiter);
        int[] numbers = new int[numbersStrings.length];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersStrings[i]);
            sum += numbers[i];
        }

        return sum;
    }
    public static void main(String[] args) {
        String numbersString = "1, 2, 3, 4, 5";

        System.out.println("Сумма числе в строке = " + getNumbersSumInString(numbersString));
    }
}
