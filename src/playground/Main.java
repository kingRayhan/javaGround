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
 * <p>
 * Stability in Sorting
 */
package playground;


import java.util.Arrays;

import ds.LinkedList;

public class Main {


    public static void main(String[] args) {
        var list = new LinkedList();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        System.out.println(Arrays.toString(list.toArray()));


    }

}
