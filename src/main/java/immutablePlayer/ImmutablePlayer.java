package immutablePlayer;

import java.util.ArrayList;
import java.util.List;

public final class ImmutablePlayer {

    private final String name;
    private final String surname;
    private final List<String> names;

    public ImmutablePlayer(String name, String surname, List<String> names) {
        this.name = name;
        this.surname = surname;
        this.names = new ArrayList<>(names);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public List<String> getNames() {
        //mozemy wykonac tutaj kopie plytka poniewaz String jest niemutowalny
        //gdyby lista przechowywala obiekty mutowalne musielibysmy opracowac inna strategie(kopia gleboka)
        return new ArrayList<>(names);
    }

    @Override
    public String toString() {
        return "ImmutablePlayer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", names=" + names +
                '}';
    }
}
