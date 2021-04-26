package polimorfizm;
import java.util.ArrayList;
import java.util.List;

public class Example {

    public static void main(String[] args) {

        List<ICar> cars = new ArrayList<>();
        cars.add(new Car());
        cars.add(new Suv());
        cars.add(new Bus());

        //polimorfizm wywolujemy metod wlasciwa dla rzeczywiscie przekazanego obiektu
        for (ICar eachCar : cars) {
            eachCar.drive();
            System.out.println();
        }


    }

}
