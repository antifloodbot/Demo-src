public class BeerSong {
    public static void main(String[] args) {
        int bottles = 2;
        String text = "Бутылки";
        while (bottles > 0) {
            System.out.println(bottles + " " + text +" пива на стене");
            System.out.println(bottles + " " + text + " пива");
            System.out.println("Возьми одну");
            System.out.println("Пусти по кругу");
            bottles = bottles - 1;
            if (bottles == 0 ) {
                System.out.println("На стене бутылок нет");
            } else {
                System.out.println(bottles + " " + text + " пива на стене");
            }
        }
    }
}
