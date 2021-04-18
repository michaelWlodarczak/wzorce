package listOfGuests;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfGuestsImpl implements ListOfGuests {

    int maxSize;
    private List<String> names;

    public ListOfGuestsImpl(int maxSize) {
        this.maxSize = maxSize;
        names = new ArrayList<>(maxSize);
    }


    @Override
    public void sort() {
        names = names.stream().sorted().collect(Collectors.toList());
    }

    @Override
    public void add(String name) {
        if (!isListFull()) {
            names.add(name);
        }
    }

    @Override
    public boolean isListFull() {
        boolean isFull = names.size() >= maxSize;
        return isFull;
    }

    @Override
    public String toString() {
        return "ListOfGuestsImpl{" +
                "maxSize=" + maxSize +
                ", names=" + names +
                '}';
    }
}
