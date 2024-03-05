package AcademItSchool;

public class test {
    public static long fibonacci(int index) {
        if (index <= 1) {
            return index;
        }

        long previousFibonacci = 0; // F0
        long currentFibonacci = 1;  // F1
        long nextFibonacci;     // Placeholder for F2 and beyond

        for (int i = 2; i <= index; ++i) {
            nextFibonacci = previousFibonacci + currentFibonacci; // Fi = Fi-1 + Fi-2
            previousFibonacci = currentFibonacci; // Shift for the next iteration
            currentFibonacci = nextFibonacci;     // Shift for the next iteration
        }

        return currentFibonacci;
    }

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++){
            System.out.println("Число фибоначчи с индексом " + i + " = " + fibonacci(i));
        }

        /*int index = 1; // Example index
        System.out.println("The Fibonacci number at index " + index + " is " + fibonacci(index));*/
    }
}
