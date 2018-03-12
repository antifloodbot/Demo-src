package sandbox;

import java.util.Random;

public class MaxAndMin {
    public static void main(String[] args) {
        Random r = new Random();
        int value;
        int max = 0;
        int min = 15;
        for (int a = 0; a <= 15; a++) {
            value = r.nextInt(10);
            System.out.print(value + " ");
            if (value > max)
                max = value;
            if (value < min)
                min = value;
        }
        System.out.println();
        System.out.println(min);
        System.out.println(max);
    }
}

