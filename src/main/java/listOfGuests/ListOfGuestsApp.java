package listOfGuests;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfGuestsApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many guests will be at the party?");
        int maxNoOfGuests = input.nextInt();

        ListOfGuests listOfGuests = new ListOfGuestsImpl(maxNoOfGuests);

        /*while (!listOfGuests.isListFull()){
            System.out.println("What is the name of the guest ?");
            listOfGuests.add(input.nextLine());
        } */
        for (int i = 0; i < maxNoOfGuests; i++) {
            listOfGuests.add(input.nextLine());
            System.out.println("What is the name of the guest?");
            listOfGuests.add(input.nextLine());
        }

        System.out.println(listOfGuests);
    }
}
