package zadanieSlajd38;

public class App2 {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3};
        System.out.println(sumaElementowTablicy(tab));
        System.out.println(sumaElementow(tab));

    }

    public static long sumaElementowTablicy(int[] tab) {
        long suma = 0;
        for (int element : tab) {
            suma += element;
        }
        return suma;
    }

    public static long sumaElementow(int[] tab) {
        long suma2 = 0;
        for (int i = 0; i < tab.length; i++) {
            suma2 += tab[i];
        }
        return suma2;
    }
}


