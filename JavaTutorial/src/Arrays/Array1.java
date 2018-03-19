package Arrays;

import java.util.Random;

//  int randomNum = rand.nextInt((max - min) + 1) + min;
public class Array1 {
    public static void main(String[] args) {
        Random r = new Random();
        int min = 5;
        int max = 10;
        int[] array = new int[r.nextInt((max - min) + 1) + min];
        for (int a = 0; a < array.length; a++) {
            array[a] = r.nextInt(100);
            System.out.print(array[a] + " ");
        }
        System.out.println();
        //max, min
        int minValue = array[0];
        int maxValue = array[0];
        for (int a = 0; a < array.length; a++) {
            if (array[a] < minValue)
                minValue = array[a];
            if (array[a] > maxValue)
                maxValue = array[a];
        }
        System.out.println(minValue + " " + maxValue);
    }
}
