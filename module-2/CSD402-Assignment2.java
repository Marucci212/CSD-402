// Justin Marucci 
// 06/06/2025
// Assignment 2
// This is a rock, paper, scissors program 
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Create a Random object to generate the computer's move
        Random random = new Random();

        // Generate a random number between 1 and 3 for computer's choice
        int computerChoice = random.nextInt(3) + 1;

        // Display options to the user
        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Choose your move:");
        System.out.println("1 - Rock");
        System.out.println("2 - Paper");
        System.out.println("3 - Scissors");
        System.out.print("Enter 1, 2, or 3: ");

        // Get the user's choice
        int userChoice = scanner.nextInt();

        // Show what both the user and the computer picked
        System.out.println("You chose: " + getChoiceName(userChoice));
        System.out.println("Computer chose: " + getChoiceName(computerChoice));

        // Determine the winner
        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) ||
                   (userChoice == 2 && computerChoice == 1) ||
                   (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        // Close the scanner to avoid warnings
        scanner.close();
    }

    // This method returns the name of the move based on number
    public static String getChoiceName(int choice) {
        if (choice == 1) {
            return "Rock";
        } else if (choice == 2) {
            return "Paper";
        } else if (choice == 3) {
            return "Scissors";
        } else {
            return "Invalid";
        }
    }
}



// https://github.com/Marucci212/CSD-402.git
