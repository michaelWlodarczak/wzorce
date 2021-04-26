package liczbaOkreslonychZnakowWSlowie;

public class NonStaticCharCounterHelper {
    private String word;

    public NonStaticCharCounterHelper(String word) {
        this.word = word;
    }


    public int countOccurrencesLettersInWord(char[] letters) {

        int counter = 0;  // bez modyfikatora dostepu wewnatrz metoday np. private, ale rowniez final

        for (char letter : letters){
            for (int j = 0; j <word.toCharArray().length ; j++) {
                if (letter == word.charAt(j)){
                    counter++;
                }
            }
        }
        return counter;
    }
}

