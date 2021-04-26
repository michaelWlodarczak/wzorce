package immutablePlayer;

import java.util.ArrayList;
import java.util.List;

public class ImmutableExample {

    public static void main(String[] args) {

        //obiekty niemutowalne to obiekty, ktore nie zmieniaja swojego stanu jesli wywolujemy na nich rozne metody
        //zaleta, mamy pewnosc, ze raz utworzony obiekt nie zmieni stanu
        //pomocne przy programowaniu wielowatkowym
        String kot = "kot";
        kot.toUpperCase();
        System.out.println(kot);

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Arnold");


        ImmutablePlayer player = new ImmutablePlayer("John", "Rambo", names);
//        player = new ImmutableFakePlayer("John", "Rambo");
//        player.name = "John";
//        System.out.println(player.name);
        System.out.println(player.getName());
        System.out.println(player);
        names.clear();
        names.add("psikus");
        System.out.println(player);

        player.getNames().clear();
        System.out.println(player);

    }
}