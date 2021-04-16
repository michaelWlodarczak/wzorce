package printer;

public class PrinterCapitalLetter implements Printer{ // implementacja interfejsu
    @Override  //nadpisanie metody z interfejsu Printer
    public void print(String text) {
        System.out.println(text.toUpperCase());
    }
}