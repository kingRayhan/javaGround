/*
Array is considered into two parts
- sorted and unsorted
- Initially whole array is unsorted

repeat (numOfElements - 1) times
  set the first unsorted element as the minimum
  for each of the unsorted elements
    if element < currentMinimum
      set element as new minimum
  swap minimum with first unsorted position
--------------------------

## Algorithm
-------------------------
1. Selection: Select the lowest element from the remaining array
2. Swaping: Swap that with starting position
*/

package algo.sorting;

import utils.Utils;

public class SelectionSort {

    public static int findMinIndex(int[] inputArray, int SearchStartIndex) {
        var minIndex = SearchStartIndex;
        for (var i = SearchStartIndex; i < inputArray.length; i++) {
            if (inputArray[i] < inputArray[minIndex])
                minIndex = i;
        }
        return minIndex;
    }


    public static void sort(int[] inputArray) {
        for (var i = 0; i < inputArray.length; i++) { // O(n)

            // 1. Select the lowest element from the remaining array
            var minIndex = findMinIndex(inputArray , i);

            // 2. Swap that element with selected element
            Utils.swap(inputArray , i , minIndex);

        }
    }
}
