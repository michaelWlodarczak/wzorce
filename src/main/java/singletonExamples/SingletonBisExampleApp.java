package singletonExamples;

public class SingletonBisExampleApp {
    public static void main(String[] args) {

        SingletonBisExample singleton = SingletonBisExample.getInstance();
        int sequence = singleton.getSequence();
        System.out.println(sequence);
        System.out.println(singleton.getSequence());
        System.out.println(singleton.getSequence());
        System.out.println(singleton.getSequence());
        System.out.println(singleton.getSequence());

        singleton.addNames("Krzys");
        singleton.addNames("Hania");

        System.out.println(singleton.getNames());
        //bufor wydruku
        //punkt dostepowy do baz danych
        //cache aplikacji
        //generator numerow Klientow, numerow faktur

    }
}
