package decoratorPizza;

public class SalamiPizzaDecorator extends BasicPizzaDecorator {
    public int salamiPrice = 15;


    public SalamiPizzaDecorator(IPizza pizza){
        super(pizza);
    }

    @Override
    public void getPrice() {
        super.getPrice();
        System.out.println("Cena za salami" + salamiPrice);
    }
}
