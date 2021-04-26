package pomidor;

public class PomidorApp {
    public static void main(String[] args){
        System.out.println(Pomidor.reactToFirstLetter("Pierwsza koza do woza"));
        System.out.println(Pomidor.reactToFirstLetter("pierwsza koza do woza"));
        System.out.println(Pomidor.reactToFirstLetter("1 koza do woza"));
        System.out.println(Pomidor.reactToFirstLetter(" koza do woza"));
    }


}
