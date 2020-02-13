/**
 * Lookup O(1)
 * Insert O(n)
 * Delete
 * Best: O(1) --> when we remove the last item
 * Worst: O(n) --> Remove the first item
 */

/**
 * Arrays in java is fixed size.
 * Thats means, size of array is fixed and its can not be changed. We can not
 * push extra item on out of index size as like language those have dynamic array.
 * **Javascript** array is a dynamic Array.
 */

package playground;

import utils.Data;
import utils.Utils;

import java.util.Arrays;

public class Array__ {
    public Array__(){
        /**
         * Ineger Array
         */
        int[] numbers = {1, 2, 3};

        /**
         * String Array
         */
        String[] names = new String[3];
        names[0] = "Shosi";
        names[1] = "Orchie";
        names[2] = "Jefry";

        /**
         * Custom Data class array
         */
        Data[] datas = {
                new Data(1, "A"),
                new Data(2, "B"),
                new Data(3, "C"),
                new Data(4, "D"),
                new Data(5, "E"),
                new Data(6, "F")
        };


        Utils.lines();

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        Utils.lines();

        for (String name : names) {
            System.out.println(name);
        }

        Utils.lines();

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(datas));
    }
}
