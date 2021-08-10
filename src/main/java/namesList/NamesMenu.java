package namesList;

import java.util.Scanner;

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
                    "\ne) Lista dzieci z WIELKIEJ LITERY" +
                    "\nf) Lista dzieci z malej litery" +
                    "\ng) EXIT");

            String operation = input.nextLine();

            switch (operation) {
                case "a":
                    System.out.println("Podaj imie dziecka: ");
                    childrenNames.addToList(input.nextLine());
                    break;
                case "b":
                    System.out.println("Wyswietl liste dzieci: ");
                    System.out.println(childrenNames.getChildren());
                    break;
                case "c":
                    System.out.println("Posortuj liste dzieci: ");
                    childrenNames.sortChildren();
                    System.out.println("Posortowana alfabetycznie lista dzieci: " + childrenNames);
                    break;
                case "d":
                    System.out.println("Wyczysc duplikaty");
                    childrenNames.removeDuplicates();
                    System.out.println("Lista dzieci bez duplikatów: " + childrenNames);
                    break;
                case "e":
                    System.out.println("Lista dzieci z WIELKIEJ LITERY");
                    childrenNames.namesToUpperCase();
                    System.out.println("Lista dzieci z WIELKIEJ LITERY" + childrenNames);
                    break;
                case "f":
                    System.out.println("Lista dzieci z malej litery");
                    childrenNames.namesToLowerCase();
                    System.out.println("Lista dzieci z malej litery" + childrenNames);
                    break;
                case "g":
                    System.out.println("EXIT");
                    System.exit(-1);
                    break;
                default:
                    System.out.println("Wprowadzono niepoprawna wartosc");
            }
        }
    }
}
