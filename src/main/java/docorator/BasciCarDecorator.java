package docorator;

public class BasciCarDecorator implements ICar{

    private ICar basicCar;

    public BasciCarDecorator(ICar basicCar) {
        this.basicCar = basicCar;
    }

    @Override
    public void startEngine() {
        this.basicCar.startEngine();
    }
}
