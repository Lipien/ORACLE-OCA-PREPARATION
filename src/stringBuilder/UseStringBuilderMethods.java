package stringBuilder;

import java.util.Arrays;
import java.util.Objects;

public class UseStringBuilderMethods {
    private final char value[];
    /**
     * The offset is the first index of the
     * storage that is used.
     */
    private final int offset;

    public UseStringBuilderMethods(char[] value, int offset) {
        this.value = value;
        this.offset = offset;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UseStringBuilderMethods that = (UseStringBuilderMethods) o;
        return offset == that.offset &&
                Arrays.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(offset);
        result = 31 * result + Arrays.hashCode(value);
        return result;
    }

    public static void main(String[] args) {
        StringBuilder mateyMessage;
        mateyMessage = new StringBuilder("Shivers!");
        /* Prints out "Shivers! Bad Storm!" */
        System.out.println(mateyMessage.append(" Bad Storm!"));
        StringBuilder e = new StringBuilder("Examples:");
        e.append(" ").append("1"); // String
        e.append(" ").append(new StringBuffer("2"));
        e.append(" ").append('\u0031'); // char
        e.append(" ").append((int) 2); // int
        e.append(" ").append(1L); // long
        e.append(" ").append(2F); // float
        e.append(" ").append(1D); // double
        e.append(" ").append(true); // true
        /* Prints out "Examples: 1 2 1 2 1 2.0 1.0 true" */
        System.out.println(e);

        StringBuilder mateyMessage1;
        mateyMessage1 = new StringBuilder("Shiver Me Tim");
        /* Prints out "Shiver Me Timbers and Bricks! */
        System.out.println(mateyMessage1.insert(13, "bers and Bricks!"));
        mateyMessage1.delete(6, 16);
        System.out.println(mateyMessage1);

        mateyMessage1.reverse();
        System.out.println(mateyMessage1);

        StringBuilder str = new StringBuilder("Test");
        CharSequence test2 = "test2";
        StringBuilder str2 = new StringBuilder().append(test2);
        str2.toString();
        System.out.println(str.toString());
        StringBuilder dtr3 = new StringBuilder();
        System.out.println(dtr3);

        String eggs1 = "Cackle fruit";
        String eggs2 = "Cackle fruit1";
        System.out.println(eggs1.compareTo(eggs2));

        Runnable text = () -> {
            System.out.println("TextLambda");
        };
        text.run();
        String name1 = new String("Benjamin");
        StringBuilder name2 = new StringBuilder("Benjamin");
        String name3 = name2.toString();
        System.out.println(name3.equals(name1));
    }
}
