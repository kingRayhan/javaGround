/**
 * Best: O(n logn)
 * Average: O(n logn)
 * Best: O(n logn)
 */
package algo.sorting;

public class MergeSort {
    public static void copyArray(int[] srcArray, int[] destArray, int startIndex, int lastIndex) {
        var index = 0;
        for (var i = startIndex; i < lastIndex; i++) {
            destArray[index] = srcArray[i];
            index++;
        }
    }

    public static void sort(int[] inputArray) {

        if(inputArray.length == 1)
            return;

        // 1. Divide `inputArray` into half
        var middle = inputArray.length / 2;
        int[] left = new int[middle];
        int[] right = new int[inputArray.length - middle];

        // copy to left array
        copyArray(inputArray, left, 0, middle);

        // copy to right array
        copyArray(inputArray, right, middle, inputArray.length);

        // 2. Sort each half
        sort(left);
        sort(right);

        // 3. Merge the result
        merge(left, right, inputArray);

    }

    public static void merge(int[] left, int[] right, int[] result) {
        int leftIndex = 0, rightIndex = 0, resultIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] <= right[rightIndex])
                result[resultIndex++] = left[leftIndex++];
            else
                result[resultIndex++] = right[rightIndex++];
        }

        // Coping the remaining items of left and right arrays
        while (leftIndex < left.length)
            result[resultIndex++] = left[leftIndex++];
        while (rightIndex < right.length)
            result[resultIndex++] = right[rightIndex++];
    }

}

