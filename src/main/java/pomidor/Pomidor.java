package pomidor;

//        Napisz metode, ktora przyjmuje jako argument typ String i zwraca obiekt String.
//        W zaleznosci od tego, jaka jest pierwsza litera przekazanego Stringa metoda zwraca:
//        jesli przekazany obiekt zaczyna sie na mala litere zwraca "mala lietera"
//        jesli przekazany obiekt zaczyna sie na duza litere zwraca "duza lietera"
//        jesli przekazany obiekt zaczyna sie na cyfre zwraca "cyfra"
//        w przeciwnym wypadku zwraca zwraca "pomidor"

public class Pomidor {

    public static String reactToFirstLetter(String text) {
        char firstChar = text.charAt(0);
        if (Character.isDigit(firstChar)) {  // uzycie biblioteki standardowej
            return "cyfra";
        } else if (Character.isLowerCase(firstChar)){
            return "mala litera";
        }else if (Character.isUpperCase(firstChar)){
            return "duza litera";
        }else {
            return "pomidor";
        }
    }
}

