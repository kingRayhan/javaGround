/**
 * Big O notation
 * --------------------------
 * Bubble Sort
 * Insertion Sort
 * Selection Sort
 * Merge Sort
 * Heap Sort
 * Quick Sort
 * Redix Sort
 * Stability in Sorting
 */
package playground;

import algo.sorting.*;
import utils.*;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {3, 2, 1 , 9};

//        SelectionSort.sort(numbers);
//        BubbleSort.sort(numbers);
        InsertionSort.sort(numbers);
        Utils.lines("After sort");
        for (int n : numbers)
            System.out.println(n);
    }

}
