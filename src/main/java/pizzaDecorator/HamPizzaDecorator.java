package pizzaDecorator;

public class HamPizzaDecorator extends BasicPizzaDecorator {
     private int hamPrice = 10;

    public HamPizzaDecorator(IPizza pizza) {
        super(pizza);
    }

    @Override
    public void getPrice() {
        super.getPrice();
        System.out.println("Cena za szynke" + hamPrice);
    }
}
