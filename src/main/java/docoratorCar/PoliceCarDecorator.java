package docoratorCar;

public class PoliceCarDecorator extends BasciCarDecorator{
    public PoliceCarDecorator(ICar basicCar) {
        super(basicCar);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Check police car system");
    }
}
