package algorithm;


import java.util.Arrays;

public class Exercitii {
    public static void main(String[] args) {

        int[] array = {1, 2, 9, 8, 3, 4, 7, 6, 5};
        System.out.println("Before sorting method -> ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println('\n');
        System.out.println("After sorting method -> ");

        mySortMethod(array);
        for (int j : array) {
            System.out.print(j+" ");
        }


    }

    public static void mySortMethod(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
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
