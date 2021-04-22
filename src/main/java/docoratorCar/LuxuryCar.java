package docoratorCar;

public class LuxuryCar extends BasciCarDecorator{

    public LuxuryCar(ICar basicCar) {
        super(basicCar);

    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Check aircon");
    }
}
