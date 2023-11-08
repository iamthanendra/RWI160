import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
class TestLocal1
{
    public static void main(String[] args)
    {
        // yyyy-MM-dd
        LocalDate date = LocalDate.now(); //will get current date from system
        System.out.println(date);

        //hh:mm:ss.nanosec
        LocalTime time = LocalTime.now(); //will get current time from system
        System.out.println(time);

        //yyyy-MM-ddThh:mm:ss.nanosec
        LocalDateTime datetime = LocalDateTime.now(); //will get and time from system
        System.out.println(datetime);
    }
}