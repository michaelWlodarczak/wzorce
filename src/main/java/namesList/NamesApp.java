package namesList;

public class NamesApp {
    public static void main(String[] args) {
        Names nameList = new Names();
        nameList.addToList("Krzys");
        nameList.addToList("Hania");
        nameList.addToList("Michal");
        nameList.addToList("Michal");
        nameList.addToList("Franek");
        nameList.addToList("Leon");

        System.out.println("Name's list: " + nameList + "\n");
        nameList.sortChildren();
        System.out.println("Sorted names list: " + nameList + "\n");
        nameList.removeDuplicates();
        System.out.println("Duplicates removed: " + nameList + "\n");
        nameList.namesToUpperCase();
        System.out.println("Names to upper case: " + nameList + "\n");
        nameList.namesToLowerCase();
        System.out.println("Names to lower case: " + nameList);

    }
}
