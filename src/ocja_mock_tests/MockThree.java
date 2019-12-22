package ocja_mock_tests;

import java.util.ArrayList;
import java.util.List;

public class MockThree {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Java");
        String s2 = "Love";
        s1.append(s2);
        s1.substring(4);
        int foundAt = s1.indexOf(s2);
        System.out.println(foundAt); // 4
    }
}
