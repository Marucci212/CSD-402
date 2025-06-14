// Justin Marucci 
// 06/12/2025
// Assignment 4
// This program calculates the average of arrays of different data types 

public class AverageCalc {

    // Method for short array
    public static short average(short[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (short)(sum / array.length);
    }

    // Method for int array
    public static int average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    // Method for long array
    public static long average(long[] array) {
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    // Method for double array
    public static double average(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    // Main method to test all average methods
    public static void main(String[] args) {

        // Create the arrays
        short[] shortArray = {10, 20, 30};
        int[] intArray = {5, 10, 15, 20};
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        double[] doubleArray = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};

        // Display short array and average
        System.out.print("Short array: ");
        for (int i = 0; i < shortArray.length; i++) {
            System.out.print(shortArray[i] + " ");
        }
        System.out.println();
        System.out.println("Average (short): " + average(shortArray));
        System.out.println();

        // Display int array and average
        System.out.print("Int array: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        System.out.println("Average (int): " + average(intArray));
        System.out.println();

        // Display long array and average
        System.out.print("Long array: ");
        for (int i = 0; i < longArray.length; i++) {
            System.out.print(longArray[i] + " ");
        }
        System.out.println();
        System.out.println("Average (long): " + average(longArray));
        System.out.println();

        // Display double array and average
        System.out.print("Double array: ");
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print(doubleArray[i] + " ");
        }
        System.out.println();
        System.out.println("Average (double): " + average(doubleArray));
    }
}

