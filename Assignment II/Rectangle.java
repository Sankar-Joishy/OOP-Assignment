public class Rectangle {
    private float length;
    private float width;

    // Default constructor
    public Rectangle() {
        this.length = 1.0f;
        this.width = 1.0f;
    }

    // Constructor with length and width
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    // Getters
    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    // Setters
    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    // Method to calculate area
    public float getArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public float getPerimeter() {
        return 2 * (length + width);
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Rectangle[length=" + length + ", width=" + width + "]";
    }
}

