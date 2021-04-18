package zadanieSlajd38;

import java.util.Arrays;
import java.util.Random;

public class SumOfNumbersImpl implements SumOfNumbers {

    int[] myArray; //= new int[size];  //wartosc domyslna 0

    public SumOfNumbersImpl(int size) {
        this.myArray = new int[size];
        fillArrayRandomValues();
        System.out.println(Arrays.toString(myArray));
        System.out.println(myArray.length);
    }

    @Override
    public int getSumOfNumbers() {
        int sum = 0;
        for (int element : myArray){
            sum += element;
        }
        return sum;
    }

    private void fillArrayRandomValues(){
        Random r = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = r.nextInt(100);
        }
    }
}