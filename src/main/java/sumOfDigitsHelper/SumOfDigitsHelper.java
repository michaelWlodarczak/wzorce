package sumOfDigitsHelper;

public class SumOfDigitsHelper {

    public static int getSumOfDigitsHelper(String text) {
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            char znak = text.charAt(i);
            if (Character.isDigit(znak))
            sum = sum + Character.getNumericValue(znak);
        }
        return sum;
    }
}
