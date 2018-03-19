package Arrays;
// создать стринговый массив и вывести в консоль самое длинное слово
public class Array7 {
    public static void main(String[] args) {
        String [] array = {"sport", "computer", "blablabla"};
       /* String max = array[0];
        for (int a = 0; a < array.length; a++) {
            if (array[a].length() > max.length())
                max = array[a];
        }
        System.out.println(max);*/
        // через int
        int max = 0;
        for (int a = 0; a < array.length; a++) {
            if (array[a].length() > array[max].length())
                max = a;
        }
        System.out.println(array[max]);
    }
}
