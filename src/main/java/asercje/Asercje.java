package asercje;

import java.util.Scanner;
//aby wlaczyc asercje nalezy dodac -ea w argumentach uruchomienia w vm options
//nie wlaczamy asercji na srodowisku produkcyjnym
public class Asercje {
    public static void main(String[] args) {
        System.out.println("Podaj numer");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //wartosc bezwzgledna z liczby
        number = Math.abs(number);
        System.out.println(number);
        //czy tu moge miec pewnosc, ze numer nie jest ujemny?
        number = -1;

        //assert number > 0;
        assert number > 0 : number;
        System.out.println("po asercji");
    }
}
