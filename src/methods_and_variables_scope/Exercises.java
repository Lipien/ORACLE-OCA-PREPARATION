package methods_and_variables_scope;

public class Exercises {
    public static void main(String[] args) {
        Exercises exercises = new Exercises();
        //Passing Primitives by Value to Methods
        int value = 1;
        System.out.println("Argument: value = " + value);
        exercises.addTwo(value); // 3
        System.out.println("After method call: value = " + value); // ATTENTION: 1

    }

    void addTwo(int value) {
        System.out.println("Parameter: value = " + value);
        value = value + 2;
        System.out.println("Leaving method: value = " + value);
    }
}
