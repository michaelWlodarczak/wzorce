package pizzaDecorator;

public class Pizza implements IPizza{

    @Override
    public void getPrice() {
        System.out.println("Cena ciasta do pizzy: 10");
    }
}
