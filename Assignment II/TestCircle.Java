public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(); // Default constructor
        System.out.println(c1);
        
        Circle c2 = new Circle(5.0); // Constructor with radius
        System.out.println(c2);
        
        Circle c3 = new Circle(5.0, "blue"); // Constructor with radius and color
        System.out.println(c3);
        
        // Test getter for color
        System.out.println("Color of c3: " + c3.getColor());

        // Test setters
        c3.setRadius(10.0);
        c3.setColor("green");
        System.out.println("Updated c3: " + c3);
    }
}
