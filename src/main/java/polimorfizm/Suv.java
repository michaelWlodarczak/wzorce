package polimorfizm;
public class Suv extends Car {

    @Override //adnotacja nie jest obowiazkowa, informuje kompilator, ze nasz intencja jest nadpisanie metody
    //jesli metoda w klasie bazowej przestanie istniec dostaniemy blad kompilacji
    public void drive() {
        super.drive();
        System.out.println("drive - suv");
    }

}
