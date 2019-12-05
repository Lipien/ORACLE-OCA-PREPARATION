package methods_and_variables_scope;

public class Number {
    int number;

    public Number(int number) {
        this.number = number;
    }

    int getNumber() {
        return this.number;
    }

    void setNumber(int number) {
        this.number = number;
    }

    public static void main(String[] args) {
        Number value = new Number(1);
        System.out.println("Argument: value = " + value.getNumber());
        addThree(value); // 4
        System.out.println("After method call: value = " + value.getNumber()); // 4 =>reference increased by 3

        String string = "String przed";
        System.out.println("Argument: string = " + string);
        string.concat("PO"); // "StringPO"
        System.out.println("After method call: string = " + string); //string remains unchanged: :String przed"

        int value2 = 10;
        System.out.println("Argument: value2 = " + value2);
        addThree(value2); // 13
        System.out.println("After method call: value2 = " + value2); // 10

        Integer value3 = 20;
        System.out.println("Argument: value3 = " + value3);
        addThree(value3); // 23
        System.out.println("After method call: value2 = " + value3); // wrappers are immutable =>20

        Integer value4 = 200;
        System.out.println("Argument: value4 = " + value4);
        addThree(value4); //203
        System.out.println("After method call: value4 = " + value4); //200

    }

    static void addThree(Number value) {
        System.out.println("Parameter: value = " + value.getNumber());
        value.setNumber(value.getNumber() + 3);
        System.out.println("Leaving method: value = " + value.getNumber());
    }

    static void addThree(int value2) {
        System.out.println("Parameter: value2 = " + value2);
        value2 = value2 + 3;
        System.out.println("Leaving method: value2 = " + value2);
    }

    static void addThree(Integer value3) {
        System.out.println("Parameter: value3 = " + value3);
        value3 = value3 + 3;
        System.out.println("Leaving method: value3 = " + value3);
    }
}
