package ocja_mock_tests;

import java.util.Optional;

public class OptionalTest {
    private String nameN(){
        String nameN = "Java";
        return (nameN.length() > 5) ? nameN :  null;
    }
    public static void main(String[] args) {
        String name = null;
        Optional<String> optional = Optional.ofNullable(name);
        System.out.println(optional);

        String nameP = null;
        Optional<String> optionalP = Optional.empty();
        System.out.println(optionalP);
    }
}
