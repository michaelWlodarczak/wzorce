import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ZadanieWzorce2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
       // names.add("Tadek");
        names.add("Michal");
        names.add("Krzys");
        names.add("Michal");
        names.add("Krzys");
        names.add("Michal");

        System.out.println(names);
        //usuwa tylko pierwsze wystapienie obiektu, jesli mamy duplikaty imion,
        //usuniete zostanie pierwsze wystapienie i indeksy elementow ulegna zmianie
        names.remove("Michal");
        System.out.println(names);
//tworzymy nowa liste bez okreslonego imienia, skasuje wszystkie wystapienia
        List<String> newNames = new ArrayList<>();
        for (String name : names){
            if (!name.equals("Michal")){
                newNames.add(name);
            }
        }
//Iterator to obiekt, ktory pozwala przegladac zawartosc obiektu bez wzgledu na
        //sposob przechowania danych
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            String name = iterator.next();
            if (name.equals("Michal")){
                iterator.remove();
            }
        }
        System.out.println(names);
        //rzuci wyjatkiem jesli nie ma kolejnego elementu
       // iterator.next();

        names.removeIf(name -> name.equals("Michal"));

        Collections.sort(names);  // z imieniem "Tadek"
        System.out.println(names);
    }
}
