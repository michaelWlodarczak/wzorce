package kopiaPlytkaIGleboka;
import java.util.ArrayList;
import java.util.List;

public class KopiaGleboka {
    public static void main(String[] args) {

        List<Name> names = new ArrayList<>();
        names.add(new Name("Krzys"));
        names.add(new Name("Hania"));
        names.add(new Name("Michal"));
        System.out.println("oryginal " + names);

        List<Name> copyNames = new ArrayList<>();
        for (Name elemementFromNames : names) {
            copyNames.add(new Name(elemementFromNames.getName()));
        }

        System.out.println("kopia " + copyNames);
        copyNames.remove(0);
        copyNames.get(0).setName("psikus");


        System.out.println();
        System.out.println("oryginal" + names);
        System.out.println("kopia " + copyNames);

        //obie listy przechowuja te same obiekty
    }
}
