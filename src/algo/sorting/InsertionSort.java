/*
 * ## Insertion Sort ##
 * --------------------------
 * Best Case: O(n)
 * Average Case: O(n^2)
 * Worst Case: O(n^2)
 * */


package algo.sorting;

public class InsertionSort {
    public static void sort(int[] inputArray) {
        for (var currentIndex = 1; currentIndex < inputArray.length; currentIndex++) { // O(n)
            var currentItem = inputArray[currentIndex];
            var leftIndex = currentIndex - 1;

            for (; leftIndex >= 0 && inputArray[leftIndex] > currentItem; leftIndex--) // O(n)
                // shift left item to right
                inputArray[leftIndex + 1] = inputArray[leftIndex];

            inputArray[leftIndex + 1] = currentItem;
        }

    }
}
