package polymorphism_and_casts;

public class TesterTwo {

    public static void main(String[] args) {
        new TesterTwo();
    }

    public TesterTwo() {
        Goat goat = new Goat("Bob");
        GoatShelter goatShelter = new GoatShelter(4, 4, 6);
        Fish fish = new Fish("grayling");
        System.out.println(description(goat));
        System.out.println(description(goatShelter));
        System.out.println(description((fish)));
    }

    private String description(Describable d) {
        return d.getDescription();
    }
}
