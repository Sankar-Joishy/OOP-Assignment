public class Fan {
    // Constants for fan speeds
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Instance variables
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // Constructor
    public Fan() {
        speed = SLOW;   // Default speed is SLOW
        on = false;     // Fan is initially off
        radius = 5.0;   // Default radius is 5.0
        color = "blue"; // Default color is blue
    }

    // Accessor and mutator methods
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method to return string representation of the Fan object
    public String toString() {
        String status = on ? "on" : "off";
        return "Fan [speed=" + speed + ", status=" + status + ", radius=" + radius + ", color=" + color + "]";
    }
}
