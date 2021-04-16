package printer;

public class PrinterServiceApp {
    public static void main(String[] args) {

        PrinterService printerService = new PrinterService();
        String textToPrint = "tekst do wydruku";
      //  Printer printer = new PrinterCapitalLetter();

       // printerService.printContent(printer, textToPrint);  //w metodzie musimy inicjalizowac pola, a w klasie moga byc domyslne

        /*klasa anonimowa
        //mozemy spotkac w starszym kodzie, dzisiaj sie raczej nie stosuje
        printer.Printer printer = new printer.Printer() {
            @Override
            public void print(String text) {
            }
        };
        printerService.printContent(printer,textToPrint);
        System.out.println(textToPrint); */

        //lambda
        Printer printer = text -> System.out.println(text + " lambda");
        printerService.printContent(printer,textToPrint);

        //lambda w jednej linijce kodu
        //printerService.printContent(text -> System.out.println(text + " lambda"),textToPrint);


    }
}