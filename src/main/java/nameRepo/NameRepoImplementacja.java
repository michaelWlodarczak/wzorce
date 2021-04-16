package nameRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NameRepoImplementacja implements NamesRepo {
    int maxSize;
    private List<String> names;

    public NameRepoImplementacja(int maxSize) {
        this.maxSize = maxSize;
        // w nawiasie podano poczatkowy rozmiar listy
        //jesli go przekroczymy lista powiekszy swoj rozmiar
        names = new ArrayList<>(maxSize);
    }

    @Override
    public void sort() {
  //      Collections.sort(names);
        names = names.stream().sorted().collect(Collectors.toList());

        // names.sort();   Comparator
    }

    @Override
    public void add(String name) {
       // if (!name.isBlank() && !isRepoFull()) {
        if (!isRepoFull()) {
            names.add(name);
        }
    }

    @Override
    public void remove(String nameToRemove) {
        names.removeIf(name -> name.equalsIgnoreCase(nameToRemove));
    }


    @Override
    public boolean isRepoFull() {
        boolean isFull = names.size() >= maxSize;
        return isFull;
    }

    @Override
    public String toString() {
        return names.toString();
    }
}
