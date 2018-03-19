package Arrays;

public class Array6 {
    public static void main(String[] args) {
        //увеличить все не четные позиции массива в два раза
        int [] array = {54,3,1,0,17,6};
 /*       for (int a = 0; a < array.length; a++){
            if (a % 2 == 1 )
                array[a] = array[a] * 2;
        }
        for (int a = 0; a < array.length; a++) {
            System.out.print(array[a] + " ");
        }*/
        //обнулить четные значения массива
        for (int a = 0; a <array.length; a++) {
            if (array[a] % 2 == 0)
                array[a] = 0;
        }
        for (int a = 0; a <array.length; a++)
            System.out.print(array[a] + " ");



    }
}
