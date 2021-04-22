package docoratorCar;

public class Car implements ICar{
    @Override
    public void startEngine() {
        System.out.println("car start engine");
    }
}
