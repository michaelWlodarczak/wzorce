package liczbaOkreslonychZnakowWSlowie;

public class CharCounterApp {
        public static void main(String[] args) {

            System.out.println(CharCounterHelper
                    .countOccurrencesLettersInWord("Testowy tekst", new char[]{'e',}));  //metoda statyczna przechowuje argument "word" i nie przekazuje jej dalej
        }
    }

