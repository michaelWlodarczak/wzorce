package refleksje;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException{

        FootballPlayer player = new FootballPlayer("John","Rambo");
        System.out.println(player);

        //pobieramy polaklasy
        Field[] fields = player.getClass().getDeclaredFields();
        System.out.println(Arrays.asList());

        //poprosilem konkretne pola z klasy FootballPlayer
        Field surname = player.getClass().getDeclaredField("surname");
        //zmieniam modyfikator dostepu
        surname.setAccessible(true);
        // ustawiamy nowa wartosc
        surname.set(player, "psikus");
        System.out.println(player);

        String result = (String) surname.get(player);
        System.out.println(result);
    }
}
