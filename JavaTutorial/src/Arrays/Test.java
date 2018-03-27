package Arrays;
import java.util.Random;
// создать рандомный массив с рандомными значениями и вывести минимальное и максимальное число в массиве
public class Test {
    public static void main(String[] args) {
        Random r = new Random();
        int min = 2;
        int max = 5;
        int[] array = new int[r.nextInt((max-min)+1) + min];
        for (int a = 0; a < array.length; a++){
            array[a] = r.nextInt(20);
            System.out.print(array[a] + " ");
        }
        System.out.println();
        int minValue = array[0];
        int maxValue = array[0];
        for (int a = 0; a < array.length; a++) {
            if (array[a] < minValue)
                minValue = array [a];
            if (array[a] > maxValue)
                maxValue = array[a];
        }
        System.out.println(minValue + " " + maxValue);
    }
}
