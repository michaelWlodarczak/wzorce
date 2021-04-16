import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZadanieWzorce {
    /* Napisz program, który najpier poprosi o 5 imion na
     standardowym wejściu. Wyświetli je i zapyta,
     które skasować, po czym wyświetli listę po skasowaniu,
     posortuje ją i
    wyświetli ponownie i po skasowaniu i zakończy działanie
     */

    public static void main(String[] args) {
        System.out.println("Podaj 5 imion: ");
        List<String> names = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Wprowadz imie: ");
            String name = input.nextLine();
            names.add(name);
        }

        System.out.println("Imiona to: " + names);
        System.out.println("Które imie mam skasowac?");
        String removeName = input.nextLine();
        names.remove(removeName);
        System.out.println("Lista po skasowaniu imienia " + names);

    }
}