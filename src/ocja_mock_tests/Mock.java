package ocja_mock_tests;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Mock {

    public static int yz; // does NOT interfere with variable in method (main)

    static class MockOCJAP8 {
        public static void main(String[] args) {
            Predicate<String> sd = (s) -> s.length() > 5;
            System.out.println(sd.test("testowanie"));

            LocalDate date = LocalDate.of(2015, 3, 24);

            int yz = 0;
            System.out.println(yz); // 0

            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(11);
            list.add(30);
            list.add(9);
            for (Integer ss : list) {
                System.out.println(ss);  // 1 because of break
                break;
            }
            list.removeIf(e -> e % 2 != 0); //new in Java 8; usage of predicate and lambda
            System.out.println(list); // [30]

            for (int i = 0; i < list.size(); i++) { //without i++ endless loop
                System.out.println(list);  // [30]
            }

            String str = "1.2";
            double f = Double.parseDouble(str); //parse for primitives
            Double g = Double.valueOf(str); // valueOf for wrappers

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

class A {
    protected int y = 15;
}

class B extends A {
    int y = 10;

    public void print() {
        A a = new A();
        System.out.println(super.y + y);
    }
}




