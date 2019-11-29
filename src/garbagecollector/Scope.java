package garbagecollector;

import java.util.ArrayList;
import java.util.List;

public class Scope {
    public static void main(String[] args) {
        String one, two;
        one = new String("a");
        two = new String("b");
        one = two; //"a" is not pointed by any reference and goes to the garbage
        String three = one;
        one = null;
    }
}

class PrimeNumber {
    private Boolean isPrime = true;
    private Double primeSquareRoot = null;
    private List<String> divisorList = new ArrayList<>();

    public PrimeNumber(long candidate) {
        validatePrime(candidate);
    }

    public void validatePrime(Long c) {
        primeSquareRoot = Math.sqrt(c);
        isPrime = true;
        for (long j = 2; j <= primeSquareRoot.longValue(); j++) {
            if ((c % j) == 0) {
                divisorList.add(j + "x" + c / j);
                isPrime = false;
            }
        }
    }

    public List getDivisorList() {
        return divisorList;
    }

    public Double getPrimeSquareRoot() {
        return primeSquareRoot;
    }

    public Boolean getIsPrime() {
        return isPrime;
    }
}
