// Justin Marucci
// 6/19/2025
// Assignment 5


public class ArrayUtils {

    // Method to find the largest number's location in a 2D array of doubles
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0};
        double max = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] > max) {
                    max = arrayParam[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }

        return location;
    }

    // Method to find the largest number's location in a 2D array of integers
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int max = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] > max) {
                    max = arrayParam[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }

        return location;
    }

    // Method to find the smallest number's location in a 2D array of doubles
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double min = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] < min) {
                    min = arrayParam[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }

        return location;
    }

    // Method to find the smallest number's location in a 2D array of integers
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int min = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int col = 0; col < arrayParam[row].length; col++) {
                if (arrayParam[row][col] < min) {
                    min = arrayParam[row][col];
                    location[0] = row;
                    location[1] = col;
                }
            }
        }

        return location;
    }

    // Main method to test the above methods
    public static void main(String[] args) {
        // Example integer 2D array
        int[][] intArray = {
            {4, 8, 3},
            {6, 1, 9}
        };

        // Example double 2D array
        double[][] doubleArray = {
            {2.5, 7.1},
            {0.8, 4.6}
        };

        // Testing the methods
        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);
        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);

        // Print results
        System.out.println("Largest in int[][] is at: row " + largestInt[0] + ", column " + largestInt[1]);
        System.out.println("Smallest in int[][] is at: row " + smallestInt[0] + ", column " + smallestInt[1]);
        System.out.println("Largest in double[][] is at: row " + largestDouble[0] + ", column " + largestDouble[1]);
        System.out.println("Smallest in double[][] is at: row " + smallestDouble[0] + ", column " + smallestDouble[1]);
    }
}
