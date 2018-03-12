package sandbox;

public class First {
    public static void main(String[] args) {
        char b = 'b';
        boolean c = true;
        // есть кая то температуратура. Если она больше нуля написать одеться легко, иначе написать одеться потеплее
        int temp = 10;
        //if (temp > 0){
            //System.out.println("одеться легко");
            //System.out.println("fdgfd");
        //}
        //else System.out.println("одеться потепле");
        //есть некоторая переменная, которая зависит от температуры. Если температура больше  нуля она принимает значение 25.3
        //иначе 3
        double i;
        /*if (temp > 0)
            i = 25.3;
        else
            i = 3;*/
        //i = (temp > 0) ? 25.3 : 3;

        //System.out.println(i);
        //если температура больше 0 но меньше 10  - одеться средне Если больше 10 - полегчеб иначе потеплее
        if (temp > 0 && temp < 10) {
            System.out.println("одеться средне");
        }
        else {
            if (temp > 10)
                System.out.println("одеться полегче");
            else
                System.out.println("отедться потепле");
        }
    }
}
