package methods_and_variables_scope;

public class Exercises {
    public static void main(String[] args) {
        Exercises exercises = new Exercises();
        //Passing Primitives by Value to Methods
        int value = 1;
        System.out.println("Argument: value = " + value);
        exercises.addTwo(value);
        System.out.println("After method call: value = " + value);

    }

    void addTwo(int value) {
        System.out.println("Parameter: value = " + value);
        value = value + 2;
        System.out.println("Leaving method: value = " + value);
    }
}
