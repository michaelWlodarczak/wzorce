package zadanieSlajd38;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Random r = new Random();

        System.out.println("enter the size of the array:");

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        System.out.println("Size of new array will be: " + size);

       // List<Integer> myList = new ArrayList<>();
        int [] myArray = new int[size];

        int sum = 0;

        for (int i = 0; i < myArray.length; i++) {
          //  myList.add(r.nextInt(100));
            myArray[i] = r.nextInt(100);
            sum += myArray[i];
        }
        System.out.println(Arrays.toString(myArray));
        System.out.println("sum of the numbers in the array = " + sum);
    }
}