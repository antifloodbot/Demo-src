package Arrays;

public class Array3 {
    public static void main(String[] args) {
        char[] array = {'1', '%', '$', '7', '9', '='};
        //print only digits
        for (int a = 0; a < array.length; a++) {
            if (array[a] > 47 && array[a] < 58)
                System.out.print(array[a] + " ");
        }
    }
}
