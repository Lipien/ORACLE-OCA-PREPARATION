package string;


public class TreasureMap {
    private String owner = "Blackbeard";
    private String location = "Outer Banks";

    public String toString () {
        return "Map Owner: " + owner + ", treasure location: "
                + location;
    }

    public static void main(String[] args) {
        TreasureMap t = new TreasureMap();
        System.out.println(t);
    }
}
