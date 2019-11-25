package operatorstests;

public class OperatorsTests {
    public static void main(String[] args) {
        int score = 10;
        System.out.println("score: " + score++);//10
        System.out.println("score: " + score++);//11
        System.out.println("score: " + ++score);//13

        System.out.println( (true | false & true) + "," );

        String pirateMessage = " Buried Treasure Chest! ";
        int i3 = pirateMessage.indexOf("bure");
        System.out.println(i3);

        Color color = Color.BLACK;
        float[] f = new float[5];
        Float[] g = new Float[12];
        char c;
        c = 'l';
    }
}
