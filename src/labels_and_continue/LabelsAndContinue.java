package labels_and_continue;

public class LabelsAndContinue {
    public static void main(String[] args) {

        String[] animals = {"CAT", "DOG", "LION", "SNAKE"};

        LABEL:
        for (String animal : animals) {
            if (animal.equals("DOG")) {
                continue LABEL;
            }
            System.out.print(animal + ", "); // CAT, LION, SNAKE,
        }

        animal:
        for (String animal : animals) {
            if (animal.equals("DOG")) {
                continue animal;
            }
            System.out.print(animal + ", "); // CAT, LION, SNAKE,
        }

        animals:
        for (String animal : animals) {
            if (animal.equals("DOG")) {
                continue animals;
            }
            System.out.print(animal + ", "); // CAT, LION, SNAKE,
        }
    }
}
