// Justi  Marucci
// Assignment 7
// 06/28/2025
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
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    // Constructor with parameters
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter and Setter methods
    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method to show fan state
    public String toString() {
        if (this.on) {
            return "Fan is ON - Speed: " + this.speed + ", Radius: " + this.radius + ", Color: " + this.color;
        } else {
            return "Fan is OFF - Radius: " + this.radius + ", Color: " + this.color;
        }
    }
}
