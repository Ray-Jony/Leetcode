package SelfLearn.OnJava8.Chapter5;

import java.util.Random;

/**
 * Class VowelsAndConsonants is created on 2020/3/2 19:36.
 *
 * @author Ray
 * @version 2020/3/2
 **/

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Random rand = new Random(47);
        for (int i = 0; i < 100; i++) {
            int c = rand.nextInt(26) + 'a';
            System.out.print((char) c + ", " + c + ": ");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("vowel");
                    break;
                case 'y':
                case 'w':
                    System.out.println("Sometimes vowel");
                    break;
                default:
                    System.out.println("consonant");
            }
        }
    }
}