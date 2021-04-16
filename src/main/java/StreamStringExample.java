import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StreamStringExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Michal");
        names.add("Hania");
        names.add("Krzys");

        System.out.println(names.contains("rambo"));

        for (String name : names) {
            if (name.equalsIgnoreCase("michal")) {
                System.out.println("michal jest na liscie");
                break;
            }
        }
        // Predicate<String>predicate = nameX -> nameX.equalsIgnoreCase("michal");
        // boolean result = names.stream().anyMatch(predicate);
        boolean result = names.stream()
                .anyMatch(nameX -> nameX.equalsIgnoreCase("michal"));
        System.out.println(result);

        boolean result2 = names.stream()
                .anyMatch(h -> h.isBlank());

        System.out.println(result2);


    }
}
