package sandbox;

import java.util.Random;

public class RandomBoolean {
    public static void main(String[] args) {
        Random r = new Random(); // create new variable with Random type
        boolean b = r.nextBoolean(); // generate random boolean value and put it to the variable c
        int c = r.nextInt(); // generate random int and put it into the variable c
        int d = r.nextInt(10); // generate random int from 0 to 9 and put it into the variable d
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
