package sandbox;

import java.util.Random;

//распечатать четные числа
public class EvenDigits {
    public static void main(String[] args) {
        Random r = new Random();
        for (int a = 1; a <= 20; a++) {
            int value = r.nextInt(99); // generate random int from 0 to 98 and put to the value
            int result = value % 2; // divide value by 2 and put to the result
            if (result == 0) // check if the value has the remainder
                System.out.println(value + " "); //print into console all the even digits
        }
    }
}
