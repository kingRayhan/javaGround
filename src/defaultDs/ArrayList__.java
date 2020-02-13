package defaultDs;

import java.util.ArrayList;


/**
 * Resizable-array or dynamic array like javascript.
 * Increase the size by 50% its previos size when the size is full
 *
 *
 * lookup by index: O(1)
 * lookup by value: O(n)
 * Insert: O(n)
 * Delete: O(n)
 */

public class ArrayList__ {
    public ArrayList__() {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

//        System.out.println(numbers.indexOf(30));
//        System.out.println(numbers.lastIndexOf(10));
//        System.out.println(numbers.indexOf(10));
//        System.out.println(numbers.contains(30));

//        numbers.add(0, 1112);
//        numbers.add(0, 1111);
//        System.out.println(numbers.size());


//        for (int i = 0; i < numbers.toArray().length; i++) {
//            System.out.println(numbers[i]);
//        }

//        System.out.println(numbers);

    }
}
