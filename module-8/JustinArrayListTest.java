//Justin Marucci
// Assignment 8
// 07/02/2025

import java.util.ArrayList;
import java.util.Scanner;

public class JustinArrayListTest {

    // Method to find the maximum value in the list
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }

        int max = list.get(0);
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to stop):");
        while (true) {
            System.out.print("Enter number: ");
            int input = scanner.nextInt();
            numbers.add(input);
            if (input == 0) {
                break;
            }
        }

        Integer largest = max(numbers);
        System.out.println("The largest number in the list is: " + largest);
    }
}
