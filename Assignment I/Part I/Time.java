import java.util.Calendar;
import java.util.TimeZone;

public class Time {
    // Data fields
    private int hour;
    private int minute;
    private int second;

    // Constructor to initialize with current time in GMT
    public Time() {
        // Get current time in GMT timezone
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        
        // Set hour, minute, and second based on GMT time
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);  // Use HOUR_OF_DAY for 24-hour format
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
    }


    // Getter methods
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}
