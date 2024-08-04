public class TestFan {
    public static void main(String[] args) {
        // Create a Fan object
        Fan fan = new Fan();

        // Assign properties to the fan
        fan.setSpeed(Fan.FAST);
        fan.setRadius(10);
        fan.setColor("yellow");
        fan.setOn(true);

        // Display the fan object using toString method
        System.out.println(fan.toString());
    }
}
