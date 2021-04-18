package namesList;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Names implements ChildrenRepository {
    List<String> names = new ArrayList<>();

    @Override
    public boolean addToList(String name) {
        return names.add(name);
    }

    @Override
    public List<String> getChildren() {
        return names;
    }

    @Override
    public void sortChildren() {
        //int compare(T o1, T o2);
        Comparator<String> comparator = (string1, string2) -> string2.compareTo(string1);
        names.sort(comparator);
        //Integer.compareTo(string1.length().compareTo(string2.length));
        // Collections.sort(names);
        //   names = names.stream().sorted().collect(Collectors.toList());
    }

    @Override
    public void removeDuplicates() {
      /*  Set<String> set = new HashSet<>();
        List<String> tempList = new ArrayList<>(set);
        names = tempList;   */  // rozwiazanie3 - do sprawdzenia, mi nie dziala

        //rozwiazanie2
        //names = names.stream().distinct().collect(Collectors.toList());
        //rozwiazanie1
        List<String> tempList = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            String tempName = names.get(i);
            if (!tempList.contains(names.get(i))) {
                tempList.add(tempName);
            }
        }
        names = tempList;
    }


    @Override
    public void namesToUpperCase() {
        Function<String,String> f = name -> name.toUpperCase();
        names = names.stream().map(f).collect(Collectors.toList());  //metoda map, mapuje obiekt na inny obiekt

        //rozwiazanie1
       /* for (int i = 0; i < names.size(); i++) {
            names.set(i,names.get(i).toUpperCase());
        } */
    }

    @Override
    public void namesToLowerCase() {
        names = names.stream().map(name -> name.toLowerCase()).collect(Collectors.toList());
        //podobne rozwiazane jak w namesToUpperCase, tylko, ze w jednej linijce
    }

    @Override
    public String toString() {
        return "Names{" +
                "names=" + names +
                '}';
    }
}
