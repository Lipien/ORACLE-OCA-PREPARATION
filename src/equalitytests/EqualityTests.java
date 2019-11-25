package equalitytests;

public class EqualityTests {
    public static void main(String[] args) {
        Integer value1 = new Integer("312");
        System.out.println(value1.hashCode());
        Integer value2 = new Integer("312");
        System.out.println(value2.hashCode());
        Object object1 = new Object();
        System.out.println(object1.hashCode());
        Object object2 = new Object();
        System.out.println(object2.hashCode());
        Object object3 = value1;
        System.out.println(object3.hashCode());

        System.out.println(value1.equals(value2));
        System.out.println(value1.equals(object1));
        System.out.println(value1.equals(object3));
        System.out.println(object1.equals(object2));
    }
}
