package polimorfizm;
public class Car implements ICar {
    @Override
    public void drive() {
        System.out.println("drive - car");
    }
}
