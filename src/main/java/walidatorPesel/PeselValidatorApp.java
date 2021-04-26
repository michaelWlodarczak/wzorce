package walidatorPesel;

public class PeselValidatorApp {
    public static void main(String[] args) {

        String pesel0 = "76052739494";
        String pesel1 = "76052739494999";
        String pesel2 = "76052739494z";
        String pesel3 = "a76052739494";


        System.out.println(PeselValidatorHelper.isPeselValid(pesel0));
        System.out.println(PeselValidatorHelper.isPeselValid(pesel2));
        System.out.println();
    }
}
