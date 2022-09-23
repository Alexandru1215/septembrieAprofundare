import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {



        // linear Search 0(n)

        int[] array = {1, 2, 3, 5, 6, 8, 9, 0, 8};  //initializam Array

        int index = linearSearch(array, 12);  //declaram index , metoda linear search , parametrii array si valoarea cautata

        if (index != -1) {
            System.out.println("Pew Pew - Element  found at index : " + index);
        } else {
            System.out.println("Element  not found ! Boom!");
        }

    }
    private static int linearSearch(int[] array, int value) {  // pasul  1 e sa facem for ul in metoda

        for (int i = 0; i < array.length; i++) { // iteram un element cate unul
            if (array[i] == value) {  // conditia este ca index ul din array sa fie aceasi cu valoarea cautata
                return i;  //daca este 'true' ne intoarce pozitia index ulu i in if de sus .
            }
        }
        return -1; // daca este falsa conditia atunci = return ce am notat in Else ul if ului de sus .






    }


}
