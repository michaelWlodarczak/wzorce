package palindrome;

public class PalindromeStreamApp {
    public static void main(String[] args) {
        String sampleText = "radaR";

        PalindromeStreamImpl palindromeStream = new PalindromeStreamImpl();
        System.out.println(palindromeStream.isPalindromeUsingStream(sampleText));


    }
}
