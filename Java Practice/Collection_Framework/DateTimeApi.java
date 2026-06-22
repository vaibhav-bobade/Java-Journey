package Collection_Framework;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class DateTimeApi {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time); //16:19:01.098

        LocalTime time2 = LocalTime.of(14, 30, 0);
        System.out.println(time2); //14:30

        LocalDate date = LocalDate.now();
        System.out.println(date); //2026-06-22

        LocalDate birthDay = LocalDate.parse("2006-07-02");
        System.out.println(birthDay); //2006-07-02

        LocalDateTime preciseTime = LocalDateTime.now();
        System.out.println(preciseTime); //2026-06-22T16:27:41.240

        LocalDateTime meeting = LocalDateTime.of(2026, 6, 22, 14, 30);
        System.out.println(meeting); //2026-06-22T14:30
    }
}