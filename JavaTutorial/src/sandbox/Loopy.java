package sandbox;

import java.text.DecimalFormat;
import java.util.Random;

public class Loopy {
    //static int sum = 5;
    public static void main(String[] args) {
        /*        *//*int x = 1;
        System.out.println("Перед началом цикла");
        while (x < 4) {
            System.out.println("Внутри цикла");
            System.out.println("Значение х равно " + x);
            x++;
        }
        System.out.println("После окончания цикла");*//*
        //int a = 5;
        for( int a = 0; a < 10; a++)
            System.out.println(a);
        System.out.println("finish");
        for(int a = 0; a<10; a = a + 2)
            System.out.print(a+" ");
        System.out.println();
        for (int a = 100; a >= 1; a = a - 2)
            System.out.print(a+" ");
        System.out.println();
        //from 62.3   to 98.1    0.5
        for (double a = 62.3; a <=98.1; a = a + 0.5)
            System.out.print(a + " ");
        System.out.println();
        for(String s = "A"; s.length()<10; s = s+"A")
            System.out.println(s);*/
        Random r = new Random();
        boolean b = r.nextBoolean();
        int c = r.nextInt(10);// вывести рандомное число от 0 до 9
        int d = r.nextInt(); // вывести любое интовое значение
        System.out.println(d);
        //распечатать четные числа
        /*for (int a = 1; a <=20; a++) {
            int value = r.nextInt(99);
            int result = value%2;
            if (result == 0)
                System.out.print(value + " ");
        }*/
        //распечатать не нечетные числа
        for (int a = 1; a <= 20; a++) {
            int value = r.nextInt(99);
            int result = value % 2;
            if (result == 1)
                System.out.print(value + " ");
        }
        System.out.println();
        //сумму всех сгенерированных чисел
        int sum = 0;
        int value;
        for (int a = 0; a <= 10; a++) {
            value = r.nextInt(10);
            System.out.print(value + " ");
            sum = sum + value;
        }
        System.out.println();
        System.out.println(sum);
        //cколько нечетных чисел было сгенерировано
        int amount = 0;
        for (int a = 0; a <= 10; a++) {
            value = r.nextInt(10);
            System.out.print(value + " ");
            int result = value % 2;
            if (result == 0)
                amount = amount + 1;
        }
        System.out.println();
        System.out.println(amount);
        //cреднее арифметическое сгенерированных чисел
        int count = 0; // сумма числе
        int countAmount = 0; // счетчик чисел
        for (int a = 0; a <= 5; a++) {
            value = r.nextInt(10);
            System.out.print(value + " ");
            count = count + value;
            countAmount = countAmount + 1;
        }
        System.out.println();
        double result = count * 1.0 / countAmount; // каунт * 1.0 чтобы привести к даблу
        DecimalFormat formatter = new DecimalFormat("##.##");
        System.out.println(formatter.format(result));
        // найти наибольшее из сгенерированных чисел
        int max = 0;
        int min = 9;
        for (int a = 0; a <= 5; a++) {
            value = r.nextInt(10);
            System.out.print(value + " ");
            if (value > max)
                max = value;
            if (value < min)
                min = value;
        }
        System.out.println();
        System.out.println(max);
        System.out.println(min);
    }
}
