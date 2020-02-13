package algo.sorting;

public class InsertionSort {
    public static void sort(int[] inputArray) {
        for (var i = 1; i < inputArray.length; i++) {
            var current = inputArray[i];

            var j = i - 1;
            for (; j >= 0 && inputArray[j] > current; j--) {
                // when current item is less then previous
                // then shift the left element to right
                inputArray[j + 1] = inputArray[j];
            }
            inputArray[j + 1] = current;
        }
    }
}
