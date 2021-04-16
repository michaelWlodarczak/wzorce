package printer;

//ponizej adnotacja sprawdzajaca, czy interfejs jest funkcyjny
@FunctionalInterface
public interface Printer {

    //interfejs funkcyjny ma jedna metode abstrakcyjna
    //poniej jest metoda abstrakcyjna
    void print(String text);

    //nie moge dodac drugiej metody abstrakcyjnej, bo jest adnotacja @FunctionalInterface,
    //ktora weryfikuje, czy interfejs jest funkcyjny
    // void printCapitalLetter();

}
