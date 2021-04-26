package liczbaOkreslonychZnakowWSlowie;

public class NonStaticCounterApp {
    public static void main(String[] args) {

NonStaticCharCounterHelper nonStaticCharCounterHelper = new NonStaticCharCounterHelper("Dom to nie auto");
int counter1 = nonStaticCharCounterHelper.countOccurrencesLettersInWord(new char[]{'a','o'});
        System.out.println(counter1);


    }
}
