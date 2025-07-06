// Justin Marucci 
// Assignment 9


import java.util.ArrayList;
import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> items = new ArrayList<String>();

        // Add 10 strings to the ArrayList
        items.add("Pizza");
        items.add("Burger");
        items.add("Fries");
        items.add("Taco");
        items.add("Sushi");
        items.add("Salad");
        items.add("Steak");
        items.add("Pasta");
        items.add("Donut");
        items.add("Ice Cream");

        // Print all items using a for-each loop
        System.out.println("Here are your menu items:");
        for (String item : items) {
            System.out.println(item);
        }

        // Ask user to choose an index
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the number (0-9) of the item you'd like to see again: ");

        // Use Autoboxing to store user input in an Integer object
        Integer userChoice = input.nextInt();  // Autoboxing

        try {
            // Auto-unboxing happens here when getting value
            String chosenItem = items.get(userChoice);
            System.out.println("You chose: " + chosenItem);
        } catch (IndexOutOfBoundsException e) {
            // If user enters a number outside 0–9
            System.out.println("Exception thrown: Out of Bounds");
        }
    }
}
