package Arrays;

public class Array2 {
    public static void main(String[] args) {
        int[] array = {104, 8, 30, -4, -5};
        for (int a = array.length - 1; a >= 0; a--)
            System.out.print(array[a] + " ");
        System.out.println();
        int[] newArray = new int[array.length];
        int integerCounter = 0;
        for (int a = array.length - 1; a >= 0; a--) {
            newArray[integerCounter] = array[a];
            System.out.print(newArray[integerCounter] + " ");
            integerCounter++;
        }
    }
}