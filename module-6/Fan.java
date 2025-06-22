// Justin Marucci 
// Assignment 6
// 06/19/2025
// This program creates a fan class with fields for speed, on/off, radius, and color. It includes constructors, getters, setters and a toString method for testing 

public class Fan {

    // Constants for fan speed
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Fields for fan properties
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor (sets default values)
    public Fan() {
        speed = STOPPED;
        on = false;
        radius = 6.0;
        color = "white";
    }

    // Constructor with parameters
    public Fan(int s, boolean isOn, double r, String c) {
        speed = s;
        on = isOn;
        radius = r;
        color = c;
    }

    // Getter and Setter methods
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int s) {
        speed = s;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean o) {
        on = o;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        color = c;
    }

    // toString method to show fan state
    public String toString() {
        if (on) {
            return "Fan is ON - Speed: " + speed + ", Radius: " + radius + ", Color: " + color;
        } else {
            return "Fan is OFF - Radius: " + radius + ", Color: " + color;
        }
    }

    // Main method to test Fan class
    public static void main(String[] args) {
        // Create a fan using the no-argument constructor
        Fan fan1 = new Fan();
        System.out.println("Fan 1: " + fan1);

        // Create a fan using the constructor with arguments
        Fan fan2 = new Fan(FAST, true, 9.5, "blue");
        System.out.println("Fan 2: " + fan2);

        // Change some values in fan1
        fan1.setOn(true);
        fan1.setSpeed(MEDIUM);
        fan1.setRadius(7.0);
        fan1.setColor("black");

        // Print updated fan1
        System.out.println("Updated Fan 1: " + fan1);
    }
}
