package printer;

public class PrinterService {

    //metoda przyjmuje jako pierwszy argument obiektu typu interfejs
    //drugi argument to tekst do wydrukowania na konsoli
    public void printContent(Printer printer, String text){
        printer.print(text);
    }
}
