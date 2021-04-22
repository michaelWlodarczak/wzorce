package palindrome;

import java.util.Scanner;

public class PalindromeApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input sample text \n" +
                "the program will check if your text is a palindrome: ");

        String sampleString = input.nextLine();
        //String sampleString = "Kobyla ma maly bok";
        //String sampleString = "Tekst na uzytek cwiczenia";
        //String sampleString = "radar";

        PalindromeImpl palindrome = new PalindromeImpl(sampleString);
        System.out.println(sampleString);
        System.out.println("your text lenght is: " + sampleString.length());
        System.out.println("Is your text a palindrome: " + palindrome.isPalindrome(sampleString));






    }
}
