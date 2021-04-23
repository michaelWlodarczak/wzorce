package palindrome;

import java.util.stream.IntStream;

public class PalindromeStreamImpl implements PalindromeStream {
    @Override
    public boolean isPalindromeUsingStream(String text) {
        String clean = text.replaceAll("\\s+","").toLowerCase();
        return IntStream.range(0,text.length()/2).noneMatch(i -> text.charAt(i) != text.charAt(text.length()-i-1));
    }
}
