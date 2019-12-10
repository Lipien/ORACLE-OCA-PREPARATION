package ocja_mock_tests;

import java.time.Instant;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Mock {

    static class MockOCJAP8 {
        public static void main(String[] args) {
            int yz = 0;
            System.out.println(yz);

            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(11);
            list.add(30);
            list.add(9);
            list.removeIf(e -> e % 2 != 0); //new in Java 8; usage of predicate and lambda
            System.out.println(list);

            String str = "1.2";
            double f = Double.parseDouble(str);
            Double g = Double.valueOf(str);

            final String y = "Y";
            final String n = "N";
            String in = "y";

            switch (in.toUpperCase()) {
                case y:                         // variables HAVE to be FINAL
                    System.out.println("Yes");
                    break;
                case n:
                    System.out.println("No");
                    break;
                default:
                    System.out.println("Y/N");
            }

            String fish = "grayling";
            switch (fish.length()) {
                default:

                case 7:
                    System.out.println("less");
                    break;
                case 12:
                    System.out.println("same length");
                    break;
                case 9:
                    System.out.println("more");
                    break;
                case 4:
                    System.out.println("less");
                    break;
            }

            System.out.println(LocalTime.now());
            System.out.println(Instant.now());

            Runnable run = () -> System.out.println("1Z0-808");
            run.run();
        }
    }

    class Mock2 {
    }
}



