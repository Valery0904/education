package AcademItSchool.Lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EntriesCount {
    public static int getEntriesCount(String searchString, String filePath) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream(filePath))) {
            searchString = searchString.toUpperCase();

            int entriesCount = 0;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().toUpperCase();

                if (line.isEmpty()) {
                    continue;
                }

                int substringEntryIndex = 0;

                while ((substringEntryIndex = line.indexOf(searchString, substringEntryIndex)) != -1) {
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

        String filePath = "input.txt";

        System.out.println("Кол-во вхождений = " + getEntriesCount(searchString, filePath));
    }
}
