package customerStreamExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerApp {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Michal", 7));
        customers.add(new Customer("Hania", 777));
        customers.add(new Customer("Krzys", 2));
        customers.add(new Customer("Ula", 9));

        System.out.println(customers);
  /*      customers = customers.stream()
                .distinct()  // metoda usowa duplikaty
                .collect(Collectors.toList());
        System.out.println(customers);   */

        List<Customer> customerMoreThan100points = customers.stream()
                .filter(customer -> customer.getPoint()>100)
                .collect(Collectors.toList());
        System.out.println(customerMoreThan100points);


    }
}
