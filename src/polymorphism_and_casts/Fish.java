package polymorphism_and_casts;

public class Fish implements Describable {
    private String species;

    public Fish(String specie) {
        this.species = "I am fish species: " + specie;
    }

    public String getDescription() {
        return species;
    }
}
