public class TestRectangle {
    public static void main(String[] args) {
        // Create two Rectangle objects
        Rectangle rectangle1 = new Rectangle(5, 50);
        Rectangle rectangle2 = new Rectangle(5, 50);

        // Set the color for both rectangles (using static method)
        Rectangle.setColor("yellow");

        // Display properties of both rectangles
        rectangle1.display();
        rectangle2.display();
    }
}