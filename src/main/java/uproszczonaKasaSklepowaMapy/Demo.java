package uproszczonaKasaSklepowaMapy;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        Product water = new Product("Cisowianka", "123",20);
        Product book = new Product("Book", "987",40);

        List<Product> products = new ArrayList<>();
        products.add(water);
        products.add(book);
        System.out.println(products);


        Product waterCopy = new Product("Cisowianka", "123",20);
        products.remove(waterCopy);
        System.out.println(waterCopy);

    }
}
