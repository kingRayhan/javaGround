/*
* ## Bubble Sort ##
* --------------------------
* Best Case: O(n)
* Average Case: O(n^2)
* Worst Case: O(n^2) -> Quadretic
* */


package algo.sorting;

import utils.Utils;

public class BubbleSort {
    public static void sort(int[] inputArray) { // O(n^2)
        for (var i = 0; i < inputArray.length; i++) { // O(n)
            for (var j = 1; j < inputArray.length; j++) { // O(n)
                if (inputArray[j] < inputArray[j - 1]) {
                    Utils.swap(inputArray , j , j-1);
                }
            }
        }
    }
}
