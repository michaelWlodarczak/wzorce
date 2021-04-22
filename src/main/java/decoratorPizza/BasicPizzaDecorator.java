package decoratorPizza;

public class BasicPizzaDecorator implements IPizza {

    private IPizza pizza;

    public BasicPizzaDecorator(IPizza pizza) {
        this.pizza = pizza;
    }


    @Override
    public void getPrice() {
        pizza.getPrice();
    }
}