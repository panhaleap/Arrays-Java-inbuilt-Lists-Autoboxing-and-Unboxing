package min_element_challenge;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MinElementChallenge minElementChallenge = new MinElementChallenge();
        int[] array = minElementChallenge.readIntegers(5);
        System.out.println("Before Change " + Arrays.toString(array));
        minElementChallenge.reverse(array);
        System.out.println("After change "+ Arrays.toString(array));
    }
}
