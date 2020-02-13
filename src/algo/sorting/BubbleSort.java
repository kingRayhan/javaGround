/*
## Bubble Sort ##
*/


package algo.sorting;

import utils.Utils;

public class BubbleSort {
    public static void sort(int[] inputArray) {
        for (var i = 0; i < inputArray.length; i++) {
            for (var j = 1; j < inputArray.length; j++) {
                if (inputArray[j] < inputArray[j - 1]) {
                    Utils.swap(inputArray , j , j-1);
                }
            }
        }
    }
}
