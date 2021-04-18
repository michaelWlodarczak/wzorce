package namesList;

public class NamesApp {
    public static void main(String[] args) {
        Names nameList = new Names();
        nameList.addToList("Krzys");
        nameList.addToList("Hania");
        nameList.addToList("Michal");
        nameList.addToList("Michal");
        nameList.addToList("Franek");

        System.out.println(nameList);
        nameList.sortChildren();
        System.out.println(nameList);
        nameList.removeDuplicates();
        System.out.println(nameList);
        nameList.namesToUpperCase();
        System.out.println(nameList);
        nameList.namesToLowerCase();
        System.out.println(nameList);





    }
}
