package arraysAsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayAsListDemo {
    public static void main(String[] args) {

        //tradycyjny sposob uzycia ArraList
        List<String> names = new ArrayList<>();
        names.add("Krzys");
        names.add("Hania");
        names.add("Michal");
        System.out.println(names);

        //tablica
        String[] namesArray = {"Krzys", "Hania", "Michal"};
        System.out.println(Arrays.toString(namesArray));


        //Array.asList opakowuje tablice, tak,z e mozemy przypisac ja do interfejsu List
        //ograniczenie jest takie, ze nie mozemy dodac nowego elementu
        List<String> namesArrayAsList = Arrays.asList(namesArray);

        System.out.println(namesArrayAsList);
        //mozemy sortowac, ale nie mozemy dodawac nowych elementow
        Collections.sort(namesArrayAsList);
        System.out.println(namesArrayAsList);


        System.out.println(new String[] {"Krzys", "Hania", "Michal"});


    }
}
