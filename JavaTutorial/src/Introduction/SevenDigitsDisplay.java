package Introduction;
import java.util.Scanner;

public class SevenDigitsDisplay {

public static void main(String[] args) {
    int a;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter any valid int value: ");
    a = in.nextInt();

    System.out.println("Your display number is:");
    String v1 = "*_* ";
    String v2 = "*** ";
    String v3 = "|*| ";
    String v4 = "**| ";
    String v5 = "*_| ";
    String v6 = "|_| ";
    String v7 = "|_* ";

    String firstRaw = a + "";

    for (int b = 0; b < firstRaw.length(); b++) {
        int c = Character.digit(firstRaw.charAt(b),10);
            switch (c) {
                case 0:
                case 2:
                case 3:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.print(v1);
                    break;
                case 1:
                case 4:
                    System.out.print(v2);
            }
        }
        System.out.println();

        String secondRaw = a + "";
        for (int b = 0; b < secondRaw.length(); b++) {
            int c = Character.digit(secondRaw.charAt(b),10);
            switch (c) {
                case 0:
                    System.out.print(v3);
                    break;
                case 1:
                case 7:
                    System.out.print(v4);
                    break;
                case 2:
                case 3:
                    System.out.print(v5);
                    break;
                case 4:
                case 8:
                case 9:
                    System.out.print(v6);
                    break;
                case 5:
                case 6:
                    System.out.print(v7);
                    break;
            }
        }
        System.out.println();

        String thirdRaw = a + "";
        for (int b = 0; b < thirdRaw.length(); b++) {
            int c = Character.digit(thirdRaw.charAt(b),10);
            switch (c) {
                case 0:
                case 6:
                case 8:
                    System.out.print(v6);
                    break;
                case 1:
                case 4:
                case 7:
                case 9:
                    System.out.print(v4);
                    break;
                case 2:
                    System.out.print(v7);
                    break;
                case 3:
                case 5:
                    System.out.print(v5);
                    break;
            }
        }
    }
}

