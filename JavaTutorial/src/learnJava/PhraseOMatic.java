package learnJava;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"amazing", "awesome", "cool", "super", "nice", "good", "outstanding"};
        String[] wordListTwo = {"portal of", "piece of", "part of", "design of", "frustrating of"};
        String[] wordListThree = {"shit", "luck", "phone", "automobile", "whiskey", "jin", "vodka"};
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        int randomOne = (int) (Math.random() * oneLength);
        int randomTwo = (int) (Math.random() * twoLength);
        int randomThre = (int) (Math.random() * threeLength);
        String phrase = wordListOne[randomOne] + " " + wordListTwo[randomTwo] + " " + wordListThree[randomThre];
        System.out.println("All that we need is " + phrase);
    }
}
