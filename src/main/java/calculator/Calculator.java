package calculator;

public interface Calculator {

    public int add(int a, int b);

    public int subtract(int a, int b);

    public int multiply(int a, int b);

    public int modulo(int a, int b);

    public int divide(int a, int b) throws Exception;

    public boolean isPositive(int a); // sprawdza, czy liczba jest dodatnia

    public boolean isNegative(int a); // sprawdza, czy liczba jest ujemna

    public boolean isOdd(int a);      //sprawdza, czy liczba jest nieparzysta

    public int min(int a, int b);      // zwraca mniejsza z liczb

    public int max(int a, int b);         // zwraca wieksza z liczb

    public double average(int a, int b); // zwraca srednia z liczb

    public int power(int a, int x);       // zwraca a do potegi x

//    Na podstawie powyzszych metod, zaimplementuj 3 argumentowe wersje tych metod:

    public int addThreeIntegers(int a, int b, int c);

    public int subtractThreeIntegers(int a, int b, int c);

    public int multiplyThreeIntegers(int a, int b, int c);

    public double divideThreeIntegers(int a, int b, int c);

    public int minOfThreeIntegers(int a, int b, int c);

    public int maxOfThreeIntegers(int a, int b, int c);

    public double averageOfThreeIntegers(int a, int b, int c);
//    Napisz menu (najlepiej, aby dzialalo w petli) i testy do zadania.
}
