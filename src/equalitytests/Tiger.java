package equalitytests;

public class Tiger {
    String name = "test";

    public static double interestDue(double currentBalance, float interestRate) {
        double interestDue = currentBalance * interestRate;
        return interestDue;
    }

    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        Tiger t2 = new Tiger();
        Tiger t3 = t1;
        System.out.println(t1 == t1); // true
        System.out.println(t1 == t2); // false
        System.out.println(t1.equals(t2)); // false ; TRUE after overrading equals
        System.out.println(Tiger.interestDue(22, 33f));

        int b1 = 0b0101_0101_0101_0101;
        int b2 = 0b1010_1010_1010_1010;
        int b3 = b1 & b2;
        System.out.println("Value:" + b3);
    }
}


