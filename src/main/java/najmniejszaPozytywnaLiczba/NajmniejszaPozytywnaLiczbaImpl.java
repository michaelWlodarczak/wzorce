package najmniejszaPozytywnaLiczba;

//        Znajdz najmniesza pozytywna liczbe, ktora nie wystapila w tablicy.
//        Metoda przyjmuje jako argument tablice a zwraca liczbe int.
//        Przyklady
//        [1, 2, 4] zwraca 3
//        [-1, -3, 5] zwraca 1
//        [-1, -3, 1] zwraca 2
//        Zastanow sie nad sygnatura metody. Uzyj interfejsu.

import java.lang.reflect.Array;
import java.util.Arrays;

public class NajmniejszaPozytywnaLiczbaImpl implements NajmniejszaPozytywnaLiczba {

    public boolean isArrayContainNumber(int n, int[] numbers) {

        for (int number : numbers) {
            if (number == n) {
              return true;
            }
        }
        return false;
    }


//    @Override
//    public int najmniejszaPozytywnaLiczba(int[] numbers) {
//        int temp = 1;
//       // Arrays.sort(numbers);
//        for (int number : numbers) {
//            if (temp == number){
//                temp++;
//            }
//        }
//        return temp;
//    }

    @Override
    public int najmniejszaPozytywnaLiczba(int[] numbers) {
        int temp;
        for (temp = 1; ; temp++) {

            boolean result = isArrayContainNumber(temp, numbers);
            if (result) {
                continue; // temp++;
            } else {
                return temp;
            }
        }
    }
}
