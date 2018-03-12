package sandbox;

        import java.util.Random;

public class OddDigits {
    public static void main(String[] args) {
        Random r = new Random();
        for (int a = 1; a <= 10; a++) {
            int value = r.nextInt(12); // generate random int from 0 to 11 and put to the value
            int result = value % 2; // divide value by 2 and put to the result
            if (result == 1) // check if the value has the remainder
                System.out.println(value + " "); //print into console all the even digits
        }
    }
}
