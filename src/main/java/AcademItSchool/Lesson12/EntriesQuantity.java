package AcademItSchool.Lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EntriesQuantity {
    public static int getCountEntries(String searchString) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"))) {
            searchString = searchString.toUpperCase();

            int entriesCount = 0;

            while (scanner.hasNextLine()) {
                String string = scanner.nextLine().toUpperCase();

                if (string.isEmpty()) {
                    continue;
                }

                int substringEntryIndex = 0;

                while ((substringEntryIndex = string.indexOf(searchString, substringEntryIndex)) != -1) {
                    substringEntryIndex += searchString.length();
                    entriesCount++;
                }
            }

            return entriesCount;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку, которую хотите найти: ");
        String searchString = scanner.nextLine();

        int entriesCount = getCountEntries(searchString);
        System.out.println("Кол-во вхождений = " + entriesCount);
    }
}
