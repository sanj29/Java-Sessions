package leetcode;

import java.util.Scanner;
import java.util.stream.Stream;

public class MedalsTallies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user for country names
        System.out.print("Enter the name of country A: ");
        String countryA = scanner.nextLine();

        System.out.print("Enter the name of country B: ");
        String countryB = scanner.nextLine();

        // Input from the user for medal tallies as comma-separated strings
        System.out.print("Enter the medal tally for country A (e.g., 5,3,2 for gold, silver, bronze): ");
        String medalsA = scanner.nextLine();

        System.out.print("Enter the medal tally for country B (e.g., 3,5,4 for gold, silver, bronze): ");
        String medalsB = scanner.nextLine();

        String result = compareMedalTallies(countryA, countryB, medalsA, medalsB);
        System.out.println(result);

        scanner.close();
    }

    public static String compareMedalTallies(String countryA, String countryB, String medalsA, String medalsB) {
        // Parse the string representations of medal tallies into arrays of integers
        int totalMedalsA = Stream.of(medalsA.split(",")).mapToInt(Integer::parseInt).sum();
        int totalMedalsB = Stream.of(medalsB.split(",")).mapToInt(Integer::parseInt).sum();

        // Compare the total medal counts between the two countries
        if (totalMedalsA > totalMedalsB) {
            return countryA + " has more total medals.";
        } else if (totalMedalsA < totalMedalsB) {
            return countryB + " has more total medals.";
        } else {
            return "Both countries have the same total number of medals.";
        }
    }
}
