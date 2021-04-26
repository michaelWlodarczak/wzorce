package walidatorPesel;

//        Napisz walidator pesel zwracajacy informacje, czy pesel jest prawidłowy. Zaprezentuj dzialanie oraz napisz testy.
//        Aby sprawdzić poprawność numeru PESEL należy wykonać następujące działania:
//        Pierwszą cyfrę mnożymy przez 1,
//        drugą cyfrę mnożymy przez 3,
//        trzecią cyfrę mnożymy przez 7,
//        czwarta cyfrę mnożymy przez 9,
//        piątą cyfrę mnożymy przez 1,
//        szóstą cyfrę mnożymy przez 3,
//        siódmą cyfrę mnożymy przez 7,
//        ósmą cyfrę mnożymy przez 9,
//        dziewiątą cyfrę mnożymy przez 1,
//        dziesiątą cyfrę mnożymy przez 3,
//        jedenastą cyfrę mnożymy przez 1.
//        Tak uzyskane 11 iloczynów dodajemy do siebie. Jeśli ostatnia cyfra tej sumy jest zerem to podany PESEL jest prawidłowy. Przykład dla numeru PESEL 44051401458
//        4*1 + 4*3 + 0*7 + 5*9 + 1*1 + 4*3 + 0*7 + 1*9 + 4*1 + 5*3 + 8*1 = 4 + 12 + 0 + 45 + 1 + 12 + 0 + 9 + 4 + 15 + 8 = 110

public class PeselValidatorHelper {
    public static int[] multipliers = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3, 1};
    public static boolean isPeselValid(String pesel) {
        //mozemy usunac whitespace metoda trim
        pesel = pesel.trim();
        char[] peselDigits = pesel.toCharArray();
        if (pesel.length() != 11) {
            return false;
        }
        int sumOfDigits = 0;
        for (int i = 0; i < 11; i++) {
            //Sprawdzamy czy znaki to cyfry
            if (Character.isDigit(peselDigits[i])) {
                sumOfDigits = sumOfDigits + (Character.getNumericValue(peselDigits[i]) * multipliers[i]);
            } else {
                return false;
            }
        }
        //Sprawdzamy czy ostatnia cyfra to zero
        if (sumOfDigits % 10 == 0) {
            return true;
        }
        //Sprawdzamy czy ostatnia cyfra to zero
//        final String sum = String.valueOf(sumOfDigits);
//        if (sum.charAt((sum.length()-1)) == '0') {
//            return true;
//        }
        return false;
    }
}