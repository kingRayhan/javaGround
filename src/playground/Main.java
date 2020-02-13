/**
 * Big O notation
 * --------------------------
 * 1. Bubble Sort -
 * 2. Insertion Sort -
 * 3. Selection Sort -
 * 4. Merge Sort -
 * 5. Heap Sort
 * 6. Quick Sort
 * 7. Redix Sort
 * 8. Bucket Sort
 *
 * Stability in Sorting
 */
package playground;

import algo.sorting.*;


import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        int[] numbers = {5, 4, 1, 3};
//        MergeSort.sort(numbers);
//        SelectionSort.sort(numbers);
//        BubbleSort.sort(numbers);
        InsertionSort.sort(numbers);


        System.out.println(Arrays.toString(numbers));

    }

}
