// Justin Marucci 
// 05/06/2026
// Assingment 3
// This program makes a number pyramid


public class Main {

    public static void main(String[] args) {
        int rows = 7; // Total number of lines in the pattern

        // Outer loop controls each row
        for (int i = 0; i < rows; i++) {

            // Print leading spaces to center the numbers
            for (int s = 0; s < rows - i - 1; s++) {
                System.out.print("  "); // Two spaces for better spacing
            }

            // Print increasing part (1, 2, 4, 8...)
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * 2;
            }

            // Print decreasing part (skip the middle number)
            num = num / 4; // Go back one step in power of 2
            for (int j = 0; j < i; j++) {
                System.out.print(num + " ");
                num = num / 2;
            }

            // Print the @ symbol at the end
            System.out.println("@");
        }
    }
}



// https://github.com/Marucci212/CSD-402.git