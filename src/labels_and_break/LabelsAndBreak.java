package labels_and_break;

public class LabelsAndBreak {
    public static void main(String[] args) {
        String[] animals = {"CAT", "DOG", "LION"};

        animals:
        for (String animal : animals) {
            if (animal.equals("DOG")) {
                break animals;  //this label works fine...
            }
            System.out.println(animal); // DOG
        }

        LABEL:
        for (String animal : animals) {
            if (animal.equals("DOG")) {
                break LABEL;
            }
            System.out.println(animal);  //DOG
        }

        for (String animal : animals) {
            if (animal.equals("DOG")) {
                break;
            }
            System.out.println(animal);  //DOG
        }
    }
}
