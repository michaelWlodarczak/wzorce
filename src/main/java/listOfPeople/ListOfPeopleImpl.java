package listOfPeople;

//        Zadanie
//        Utworz program do przechowywania listy osob o okreslonym imieniu
//        Program ma funkcje dodaj osobe
//        Wyswietl osoby o okreslonym imieniu
//        Uwaga program ma przechowywac liste osob o okreslonym imieniu, nie jedna osobe
//        Pod kluczem imie przechowujemy liste osob o tym imieniu
//        Osobe dodajemy jako imie i nazwisko
//        Dodajemy osobe dodajac imie i nazwisko

import java.util.*;
import java.util.stream.Collectors;

public class ListOfPeopleImpl implements ListOfPeople {

    private Map<String, List<String>> peopleMap = new HashMap<>();

    public ListOfPeopleImpl() {
    }

    @Override
    public void addPeople(String name, String surname) {
        if (peopleMap.containsKey(name)) {
            List<String> value = peopleMap.get(name);
            if (!value.contains(surname)) {
                value.add(surname);
            }
        } else {
            List<String> surnames = new ArrayList<>();
            surnames.add(surname);
            peopleMap.put(name, surnames);
        }
    }


    //metoda zwraca liste imion
    public List<String> listOfNames(String surname) {
        Set<Map.Entry<String, List<String>>> klucze = peopleMap.entrySet();
        List<String> listOfNamesofSurname = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry :
                klucze) {
            if (entry.getValue().contains(surname)) {
                listOfNamesofSurname.add(entry.getKey());
            }
        }
        return listOfNamesofSurname;
    }
 //metoda zwraca liste imion. rozwiazanie przez stream
    public List<String> listOfNamesStream (String surname){
       return peopleMap.entrySet().stream()
               .filter(entry -> entry.getValue().contains(surname))
                .map(entry -> entry.getKey()).  //getKey() zwracamy String
                collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return peopleMap.toString();
    }
}





