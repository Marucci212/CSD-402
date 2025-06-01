// Justin Marucci
// 05/31/25
// Assignment 1
// This program calculates the energy needed to heat water

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        try {
            System.out.print("Enter the amount of water in kilograms: ");
            double waterMass = scanner.nextDouble();

            System.out.print("Enter the initial temperature in Celsius: ");
            double initialTemp = scanner.nextDouble();

            System.out.print("Enter the final temperature in Celsius: ");
            double finalTemp = scanner.nextDouble();

            // Calculate energy using the formula Q = mass * (final - initial) * 4184
            double energy = waterMass * (finalTemp - initialTemp) * 4184;

            // Display the result
            System.out.printf("The energy needed to heat the water is %.2f joules.\n", energy);
        } catch (Exception e) {
            System.out.println("Please enter valid numeric input.");
        } finally {
            scanner.close();
        }
    }
}
