package listOfPeople;

public class ListOfPeopleApp {
    public static void main(String[] args) {
        ListOfPeopleImpl person = new ListOfPeopleImpl();
        person.addPeople("jan", "kowalski");
        person.addPeople("adam", "kowalski");
        person.addPeople("jan", "zawisza");
        person.addPeople("olek", "zawisza");
        person.addPeople("antoni", "zawisza");
        System.out.println(person);

        System.out.println(person.listOfNames("zawisza"));
        System.out.println(person.listOfNamesStream("zawisza"));
        System.out.println(person.listOfNamesStream("pomidor"));
    }
}

