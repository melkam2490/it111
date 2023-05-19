import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class MyTimesDates {
    public static void main(String[]args){
        // Keep it simple-let's display the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        // I would lie see the month, day of the week and year
        Month currentMonth = LocalDate.now().getMonth();
        System.out.println(currentMonth);
        DayOfWeek currentDay = LocalDate.now().getDayOfWeek();
        System.out.println();


    }
}
