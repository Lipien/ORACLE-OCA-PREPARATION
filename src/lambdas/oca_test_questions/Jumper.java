package lambdas.oca_test_questions;

interface Jump {
    boolean isTooHigh(int height, int limit);
}


public class Jumper {

    public static void main(String[] args) {

    //    check((h, l) -> h.append(1).isEmpty(), 5);
        //
        // append and isEmpty are not int methods (from StringBuilder)
        // compilation error oin line 7

    }

    private static void check(Jump jump, int height) {
        if (jump.isTooHigh(height, 10))
            System.out.println("too high");
        else
            System.out.println("ok");
    }
}
