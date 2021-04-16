package nameRepo;

import java.util.Scanner;

public class NameRepoApp {
    public static void main(String[] args) {

        NamesRepo repo = new NameRepoImplementacja(5);

        Scanner scanner = new Scanner(System.in);
        while (!repo.isRepoFull()){
            System.out.println("Podaj imie: ");
            repo.add(scanner.nextLine());
        }

        System.out.println("ktore imie mam usunac?");
        repo.remove(scanner.nextLine());

        System.out.println(repo);
        System.out.println("Sortuje repo");
        repo.sort();
        System.out.println(repo);
    }
}
