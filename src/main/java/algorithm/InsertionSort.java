package algorithm;

public class InsertionSort {
    public static void main(String[] args) {

        /* Insertion Sort = after comparing elemets to the left shiftelements
                             to the right to make room insert a value

                         Quadratic time O(n^2)
                         small data set  =  decent
                         large dat set = BAD

                         Less steps than Bubble Sort
                         Best case is O(n) compared to Selection Sort O(n^2)
         */

        int array[] = {1, 9, 2, 8, 3, 7, 4, 6, 5};

        insertionSort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }


    }

    private static void insertionSort(int array[]) {
        for (int i = 1; i < array.length; i++) {    //
            int temp = array[i];     //valoarea gasita in i - o punem in Temp
            int j = i - 1;    // variabila J -  asta va tine evidenta la valoarea comparata indifirent de care va fi i

            while (j >= 0 && array[j] > temp) { //comparam valorile de la stanga
                array[j + 1] = array[j]; // mutam elementele de la stanga la dreapta
                j--; // scadeam cate 1
            }
            array[j + 1] = temp; // unde tinem temporat elementul cu care comparam de la stanga a drepata
        }
    }
}
