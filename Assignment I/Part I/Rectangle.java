public class Rectangle {
    private int width;
    private int height;
    private static String color = "yellow"; // Static variable for color

    // Constructor
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate area
    public int calculateArea() {
        return width * height;
    }

    // Getters and setters
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Rectangle.color = color;
    }

    // Method to display rectangle properties
    public void display() {
        System.out.println("Rectangle properties:");
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Color: " + color);
        System.out.println("Area: " + calculateArea());
        System.out.println();
    }
}
