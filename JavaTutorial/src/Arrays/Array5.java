package Arrays;
//создать массив перевертыш
public class Array5 {
    public static void main(String[] args) {
        int [] array1 = {3,8,21,65,3,2,21};
        // 1) создать новый массив
    /*for (int a = array1.length - 1; a >= 0; a--)
            System.out.print(array1[a] + " ");
        System.out.println();
        int [] arrayNew = new int [array1.length];
        int value = 0;
        for (int a = array1.length - 1; a >= 0; a--) {
            arrayNew[value] = array1[a];
            System.out.print(arrayNew[value] + " ");
            value++;*/
    // 1) реверс того же массива
        for (int a = 0; a < array1.length/2; a++) {
            int temp = array1[a];
            array1[a] = array1[array1.length-1-a];
            array1[array1.length-1-a] = temp;
        }
        for (int a = 0; a < array1.length; a++)
            System.out.print(array1[a] + " ");
        }

    }
