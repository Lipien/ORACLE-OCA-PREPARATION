package dates_and_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingAndParsingDatesAndTimes {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(date
                .format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        DateTimeFormatter shortDateTime =
                DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println(shortDateTime.format(dateTime)); // 1/20/20
        System.out.println(shortDateTime.format(date)); // 1/20/20

        DateTimeFormatter shortDateTimeMedium =
                DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println(shortDateTimeMedium.format(dateTime)); // 2020-01-20

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date2 = LocalDate.parse("01 02 2015", f);
        LocalTime time2 = LocalTime.parse("11:22");
        System.out.println(date2); // 2015-01-02
        System.out.println(time2); // 11:22
    }
}
