package namesList;

import java.util.Scanner;
//TODO dokonczyc, bo jest k*rwa lipa ;(
public class NamesMenu {
    public static void main(String[] args) {
        ChildrenRepository childrenNames = new Names();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Wybierz co chcesz zrobic: " +
                    "\na) Dodaj dziecko do listy" +
                    "\nb) Wyswietl liste dzieci" +
                    "\nc) Posortuj liste dzieci " +
                    "\nd) Wyczysc duplikaty " +
                    "\ne) EXIT");

            String operation = input.nextLine();

            switch (operation) {
                case "a":
                    System.out.println("Podaj imie dziecka: ");
                    childrenNames.addToList(input.nextLine());
                    break;
                case "b":
                    System.out.println("Wyswietl liste dzieci: ");
                    childrenNames.getChildren();
                case "c":
                    System.out.println("Posortuj liste dzieci: ");
                    childrenNames.sortChildren();
                case "e":
                    System.out.println("EXIT");
                    System.exit(-1);
                default:
                    System.out.println("Wprowadzono niepoprawna wartosc");
            }
        }
 //       System.out.println(childrenNames.getChildren());
    }
}
