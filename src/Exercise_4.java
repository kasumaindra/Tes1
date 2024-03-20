import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Exercise_4 {


    public static void main(String [] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(("yyyy-MM-dd"));
        LocalDate rubahStartDate = LocalDate.parse(startDate, formatter);
        LocalDate rubahDate = LocalDate.parse(endDate, formatter);

//        LocalDate Date1 = LocalDate.of(2024, 3, 19);
//        LocalDate Date1 = LocalDate.now();
//        LocalDate Date2 = Date1.plusDays(2);
//
//        long day_diffreance = ChronoUnit.DAYS.between(Date1, Date2);
//        System.out.println(day_diffreance);


    }
}
