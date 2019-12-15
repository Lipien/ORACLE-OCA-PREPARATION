package ocja_mock_tests;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class MockTwo implements MockTestable {
    public static void main(String[] args) {
        Double number = Double.valueOf("120D");
    //Integer number1 = Integer.valueOf("808.1"); NumberFormatException
        System.out.println(LocalTime.now());
        LocalDate localDate = LocalDate.of(2015,3,26);
        Period p = Period.ofDays(1);
        System.out.println(localDate.plus(p));

        int sum = 0;
        for (int i = 0; i <=10 ; i++)
            sum += i;
        System.out.println(sum);

        int b = MockTestable.A;
        System.out.println(b);
    }
}
