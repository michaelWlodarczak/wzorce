package liczbaOkreslonychZnakowWSlowie;
//        Przykladowe zadanie rekrutacyjne

//        Napisz program, ktory bedzie liczyl liczbe wystapien okreslonych znakow w slowie.
//        Przykladowa sygnatura public int countOccurrencesLettersInWord(String word, char[] letters){...}
//        gdzie word jest przekazanym slowem, a letters to znaki,
//        ktorych wystapienia zliczamy
//        Przyklad
//        public int countOccurrencesLettersInWord("Dom to nie auto", new char[] {'a','m'})
//        Wynik 2

import java.util.Arrays;
import java.util.List;

public class CharCounterHelper {

    //   int counter; - nie bedzie mozna sie odwolac do tego pola w metodzie statycznej

    public static int countOccurrencesLettersInWord(String word, char[] letters) {

        int counter = 0;
        char[] wordToChar = word.toCharArray();
       // letters
        word.chars().filter(k->k =='k').count();




        for (int i = 0; i < wordToChar.length; i++) {
            char charToCheck = wordToChar[i];
//            System.out.println("First loop char: " + i);
            for (int j = 0; j < letters.length; j++) {
//                System.out.println("Second loop char: " + j);
                char charWeCheck = letters[j];
                if (charToCheck == charWeCheck) {
                    counter++;
                    break;  // eliminuje puste przebiegi w petli, nie zmieniajac tak na prawde dzialania kodu
//                    System.out.println("counter: " + counter);
                }
            }
        }
        return counter;
    }
}

