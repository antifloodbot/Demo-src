package sandbox;

import java.util.Random;

public class MiddleArithmetic {
    public static void main(String[] args) {
        Random r = new Random();
        int value;
        int sum = 0;
        int digitCounter = 0;
        for (int a = 0; a <= 5; a++) {
            value = r.nextInt(10);
            System.out.print(value + " ");
            sum = sum + value; //calculate the sum of all digits
            digitCounter = digitCounter + 1; // calculate the amount of digits
        }
        System.out.println();
        double result = sum * 1 / digitCounter;
        System.out.println(result);
    }
}