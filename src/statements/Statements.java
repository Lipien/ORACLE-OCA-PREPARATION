package statements;

import java.security.SecureRandom;
import java.util.EnumMap;
import java.util.Map;
import java.util.Random;

public class Statements {
    public enum Color {
        BLACK, ORANGE
    }

    public static void main(String[] args) {

        Map<Color, String> mapa = new EnumMap<Color, String>(Color.class);
        mapa.put(Color.BLACK, "Czerwony");

        Random random = new Random();
        int rand = random.nextInt() < 10 ? 5 : 20;
        System.out.println(rand);

        if (rand > 20)
            System.out.println("TUTU");
        else if (rand < 5)
            System.out.println("PAPA");
        else
            System.out.println("RUTU");

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

        int hourOfDay = 10;
        if (hourOfDay < 11) {
            System.out.println("Good morning");
            System.out.println("What a nice day");
        }

        int y = 5;
        System.out.println((y > 5) ? 21 : "zebra");
    }
}
