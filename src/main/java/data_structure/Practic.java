package data_structure;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.*;

import static java.util.Arrays.*;


public class Practic {
    public static void main(String[] args) {

        //int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //sa gasimt index ul elementului 5
        //O(n)
      /*  int target1 = 5;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target1) System.out.println("Metoda  1 -> Linear search - target at index : " + i);

        }
        // cautare O(log n)

        int target2 = 5;
        int index = Arrays.binarySearch(array, target2);
        System.out.println("Metoda  2 -> Binary search - target at index : " + index);


        System.out.println("****** Binary search ******");

        String[] alfabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String target = "H";
        for (int i = 0; i < alfabet.length; i++) {
            if (alfabet[i].contains(target))
                System.out.println("The String of chars contains the  " +
                        " ' " + target + " ' " + " at index  : " + i);
        }



        int index2 = Arrays.binarySearch(alfabet, target);
        if (index2 == -1) {
            System.out.println("not there ");
        } else {
            System.out.println("The String of chars contains the  " +
                    " ' " + target + " ' " + " at index  : " + index2);
        }


        //     for (int i = 0; i < alfabet.length; i++) {


    /*    int indexT = binarySearch1(alfabet, target);
        if (indexT == -1) {
            System.out.println("Not found");
        } else
            System.out.println("The String of chars contains the char  " +
                    " ' " + target + " ' " + " at index  : " + indexT);


    }

    private static int binarySearch1(String[] alfabet, String target) {      // facem metoda binarySearch
        int left = 0;                                                       // declaram inceputul sirului
        int right = alfabet.length - 1;                                     // declaram sfarsitul sirului
        int count = 0;
        while (left <= right) {                                             //  conditia de a incepe
            int middle = left + (right - left) / 2;                         // declaram mijlocul sirului
            int value = target.compareTo(alfabet[middle]);
            System.out.println("Jump in " + middle + " at character " + alfabet[middle] + " step " + count++); // facultativ sa vad fazele cautarii.

            if (value == 0)
                return middle;                                   // verificam daca Targetul este la mijloc ul array ului
            if (value > 0)
                left = middle + 1;                                // verificam daca Target ul este mai mare ingnora jumatatea  stanga
            else
                right = middle - 1;                                        // daca Target ul este  mai mic ingnora partea drepta
        }
        return -1;



        // int count = 0;
        for (int i = 0; i <101; i=i+1) {
            // count++;

            System.out.println("No ." + i);
        }

        return 0;
       */
/*
        int array[] = {1,2,3,4,8,6,7,5,9,10};

        insertionSort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }


    }

    private static void insertionSort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }

 */

        // bubbleSort ex ;

        int array[] = {1, 2, 3, 5, 6, 7, 8, 4};

        String arrayS[] = {"a", "b", "d", "c", "e", "f"};

        Arrays.sort(arrayS);
        for (String s : arrayS) {
            System.out.print(s + " ");
        }

        bubbleSort(array);

        // for (int i : array) {
        //    System.out.print(i + " ");
        //  }
    }

    public static void bubbleSort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


}


