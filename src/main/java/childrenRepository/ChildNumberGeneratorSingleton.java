package childrenRepository;

import java.util.ArrayList;
import java.util.List;

public class ChildNumberGeneratorSingleton {

    private int number = 1;
    //pole ktore byloby List<String>

    // zmienna statyczna przechowujaca instancje
    private static ChildNumberGeneratorSingleton instance = new ChildNumberGeneratorSingleton();

    //prywatny konstruktor
    private ChildNumberGeneratorSingleton() {
    }

    //metoda zwracjaca singleton
    public /*synchronized*/ static ChildNumberGeneratorSingleton getInstance() {
        if (instance == null) {
            instance = new ChildNumberGeneratorSingleton();
        }
        return instance;
    }

    public int getNumber() {
        return number++;
    }



    //jedna metoda bedzie dodawala do tej listy stringow zdarzenie
    //druga metoda bedzie zwracala liste stringow (zdarzen)
}
