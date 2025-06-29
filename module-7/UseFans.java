// Justin Marucci
// Assignment 7
// 06/28/2025
import java.util.ArrayList;

public class UseFans {

    // Method to display a single Fan instance without using toString()
    public static void displayFan(Fan fan) {
        System.out.println("Fan State:");
        System.out.println("  On: " + fan.isOn());
        System.out.println("  Speed: " + fan.getSpeed());
        System.out.println("  Radius: " + fan.getRadius());
        System.out.println("  Color: " + fan.getColor());
        System.out.println("-------------------------");
    }

    // Method to display a collection of Fan instances without using toString()
    public static void displayFanCollection(ArrayList<Fan> fans) {
        for (int i = 0; i < fans.size(); i++) {
            System.out.println("Fan #" + (i + 1));
            displayFan(fans.get(i));
        }
    }

    // Main method to test functionality
    public static void main(String[] args) {
        ArrayList<Fan> fans = new ArrayList<>();

        // Add Fan instances to the collection
        fans.add(new Fan());  // default
        fans.add(new Fan(Fan.FAST, true, 10.0, "red"));
        fans.add(new Fan(Fan.SLOW, false, 7.5, "green"));
        fans.add(new Fan(Fan.MEDIUM, true, 8.0, "blue"));

        // Display the collection
        displayFanCollection(fans);
    }
}
