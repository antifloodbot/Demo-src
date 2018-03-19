package Arrays;

public class Array4 {
    public static void main(String[] args) {
        //создать массив. потом на основе этого массива создать новый массив только с четными элементами
        int[] array = {5, 65, 12, -2, -3, 456, 44};
        int counter = 0;
        for (int a = 0; a < array.length; a++) {
            if (array[a] % 2 == 0) {
                System.out.print(array[a] + " ");
                counter++;
            }
        }
        int[] newArray = new int[counter];
        counter = 0;
        for (int a = 0; a < array.length; a++){
            if (array[a] % 2 == 0) {
                newArray[counter] = array[a];
                counter++;
            }
        }
        System.out.println();
        for (int a = 0; a < newArray.length; a++)
            System.out.print(newArray[a] + " ");
    }
}