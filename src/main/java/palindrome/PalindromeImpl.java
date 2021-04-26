package palindrome;

public class PalindromeImpl implements Palindrome {

//    private String text;
//
//    public PalindromeImpl(String text) {
//        this.text = text;
//    }
//
//    public String getText() {
//        return text;
//    }
//
//    public void setText(String text) {
//        this.text = text;
//    }

    public boolean isPalindrome(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase(); // "\\s+" usuwa biale znaki
        int lenght = clean.length();
        int forward = 0;
        int backward = lenght-1;
        while (forward < backward) {  //ta linijka pozwala na sprawdzenie pojedynczego wyrazu z nieparzysta liczba znakow
            char charForward = clean.charAt(forward++);     // Metoda charAt zwraca znak znajdujący się pod wskazanym indeksem.
            char charBackward = clean.charAt(backward--);  // W przypadku przekroczenia zakresu indeksu wyrzuci wyjątek: StringIndexOutOfBoundsException.
            if (charForward != charBackward)
                return false;
        }
        return true;
    }
}

