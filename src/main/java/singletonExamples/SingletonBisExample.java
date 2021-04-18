package singletonExamples;

import java.util.ArrayList;
import java.util.List;

public class SingletonBisExample {

    private static SingletonBisExample instance = new SingletonBisExample();
    private int sequence = 1;

    private List<String> names = new ArrayList<String>();

    //metoda zwracajaca singleton
    public static SingletonBisExample getInstance() {
        return instance;
    }

    public int getSequence() {
        return sequence++;
    }

    public void addNames(String name) {
        names.add(name);
    }

    public String getNames() {
        return names.toString();
    }

    //prywatny konstruktor
    private SingletonBisExample() {

    }
}
