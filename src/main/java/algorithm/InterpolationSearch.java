package algorithm;

public class InterpolationSearch {
    public static void main(String[] args) {

        /*interpolation = improvement over binary search  best used for 'uniformly' distributed data
                           'guesses' where a value might be based on calculated probe results
                            if probe is incorrect, search are is narrowed, and a new probe is calculated.


                            average case - O(log ( log(n)))
                            worst case - O(n)[values increase exponentially]

         */

        int[] arrayN = {1,2, 3, 4, 5, 6, 7, 8, 9, 12,25,26,45,64,128,256,512,1024,};

        int target = 12;
        int index = interpolationSearch(arrayN, target);

        if (index != -1) {
            System.out.println("PEW PEW  - The target  found at index " + index);
        } else {
            System.out.println("Index is not found ! Boom! ");
        }


    }

    private static int interpolationSearch(int[] arrayN, int value) {
        int high = arrayN.length - 1;
        int low = 0;


        while (value >= arrayN[low] && value <= arrayN[high] && low <= high) {
            int probe = low + (high - low) * (value - arrayN[low]) /
                    (arrayN[high] - arrayN[low]);

            System.out.println(" times " +"probe : " + probe);
            if (arrayN[probe] == value) {
                return probe;
            } else if (arrayN[probe] < value) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }
        }
        return -1;


    }
}
