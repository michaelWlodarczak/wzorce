package iteratorExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Krzys");
        names.add("Hania");
        names.add("Michal");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(iterator.next());
    }
}
