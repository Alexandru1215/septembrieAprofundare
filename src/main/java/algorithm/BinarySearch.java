package algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {


        int[] array = new int[1000000];  // am declarat un array nou de X  elemente

        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter a number to find the Target! ");
        //int target = sc.nextInt();
        int target = 777777;
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            if(array[i] == target){
            System.out.println(target+" is at index  "+i);
        }
        }

        // int index = Arrays.binarySearch(array, target);                          // cel mai rapid :)
        //System.out.println(target + " found at index  " + index);

        int index = binarySearch(array, target);
        if (index == -1) {
            System.out.println(target + " not found!");
        } else {
            System.out.println("Element found at : " + index);
        }
    }

    private static int binarySearch(int[] array, int target) { // am generat o metoda/  sau o facem noi
        int low = 0;                                           // punctul de pornire . initiliazare inceput de sir
        int high = array.length - 1;                           // punct maxim in array  - sfarsit de sir
        int count = 0;
        while (low <= high) {                                   // conditie de start
            int middle = low + (high - low) / 2;                // declaram mijloc ul array ului
            int value = array[middle];                           // initializare  mijloc , de unde incepe cautarea

           // System.out.println("middle : " + value);            //  sa vad cate faze de cautare sunt pana la Tinta  // facultativ
            System.out.println("Jump in " + middle + " at No  " + array[middle] + " step " + count++); // facultativ sa vad fazele cautarii.
            if (value < target)
                low = middle + 1;                //conditia , in cazul in  care Tinta este mai mica decat valoarea din mijloc , igonora jumatatea din stanga
            else if (value > target)
                high = middle - 1;         // - //-  mai mare decat valoarea din mijloc / ignora jumatatea din dreapta
            else
                return middle;                                  // ceea ce este putin probabil :)   sa fie in mijloc / dar de aici incepem
        }
        return -1;                                                // nu am gasit tinta
    }
}
