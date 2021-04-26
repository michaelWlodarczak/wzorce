package liczbaOkreslonychZnakowWSlowie;

import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args) {
        String kot = "kottttt.";
        char c = 'o';
        char c2 = 'x';
        char c3 = 't';
        System.out.println(kot.indexOf(c));
        System.out.println(kot.indexOf(c2));
        System.out.println(kot.indexOf(c3));
        System.out.println(kot.indexOf(c3, 4));
        System.out.println(kot.indexOf("tt."));

        String zanie = "Jest ladna pogoda";
        System.out.println("indekx slowa pogoda to " + zanie.indexOf("pogoda"));
        String noweZdanie = zanie.substring(zanie.indexOf("ladna"));
        System.out.println(noweZdanie);

        char[] letters = {'k', 'o', 't'};
        String wordFromArray = String.valueOf(letters);
        System.out.println(wordFromArray);
        //w jaki sposob zrobic predykat, czy w slowie znajduje sie wyraz
        //albo jak stworzyc boolean
        if(wordFromArray.indexOf('k') != -1){
            System.out.println("literaz znajduje sie w wyrazie");
        }

//Java jezyk silnie typowany

        String slowoDoAnalizy = "Pomidorr";
        char[] litery = {'o','r'};
        String wyrazZLiter = String.valueOf(litery);
        //jesli chemy uzywc zmiennej w lambdzie musi byc efektywnie finalna
        //to znaczy, ze mozemy przed nia napisac slowo kluczowe final
        //wyrazZLiter = "bckjznxbcm";  zmienna efektywnie finalna

        int wynik = (int) slowoDoAnalizy.chars().filter(znak -> wyrazZLiter.charAt(znak) != -1).count();
        System.out.println(wynik);

    }
}
