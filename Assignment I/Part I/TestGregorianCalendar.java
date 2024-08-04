import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestGregorianCalendar {
    public static void main(String[] args) {
        // Create a GregorianCalendar instance for the current date
        GregorianCalendar calendar = new GregorianCalendar();

        // Get current year, month, and day
        int year = calendar.get(Calendar.YEAR);       // Note: Calendar.YEAR is used here
        int month = calendar.get(Calendar.MONTH) + 1; // Note: Calendar.MONTH is zero-based (0 = January)
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        // Display the current date
        System.out.println("Current Date:");
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }
}
