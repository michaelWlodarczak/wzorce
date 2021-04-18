package docorator;

public class CarApp {
    public static void main(String[] args) {
      /*  ICar car = new Car();
       car.startEngine();

        ICar carDecorator = new BasciCarDecorator(car);
        carDecorator.startEngine();  */

        ICar car = new LuxuryCar(new PoliceCarDecorator(new Car()));
        car.startEngine();

    }
}
