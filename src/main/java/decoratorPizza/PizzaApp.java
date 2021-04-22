package decoratorPizza;

public class PizzaApp {
    public static void main(String[] args) {

      /*  IPizza pizza = new Pizza();
        pizza.getPrice(); */

        IPizza pizza1 = new SalamiPizzaDecorator(new HamPizzaDecorator(new Pizza()));
        pizza1.getPrice();
    }
}
