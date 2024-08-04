public class Circle {
    private double radius;
    private String color;

    // Default constructor
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    // Constructor with radius
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red"; // default color
    }

    // Constructor with radius and color
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}
