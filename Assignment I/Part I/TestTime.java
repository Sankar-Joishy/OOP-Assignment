public class TestTime {
    public static void main(String[] args) {
        // Create a Time object
        Time currentTime = new Time();
        
        // Display the current time
        System.out.println("Current Time (GMT):");
        System.out.printf("Hour: %d\n", currentTime.getHour());
        System.out.printf("Minute: %d\n", currentTime.getMinute());
        System.out.printf("Second: %d\n", currentTime.getSecond());
    }
}
