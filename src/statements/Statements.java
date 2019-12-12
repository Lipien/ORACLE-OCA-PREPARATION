package statements;

import java.security.SecureRandom;

public class Statements {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        int r = secureRandom.nextInt(20);
        if (r > 4) {
            System.out.println("Above 4: " + r);
        } else if (r < 4) {
            System.out.println("Below 4: " + r);
        } else if (r == 4) {
            System.out.println("Equals 4: " + r);
        } else {
            System.out.println("I don't know...");
        }
    }
}
