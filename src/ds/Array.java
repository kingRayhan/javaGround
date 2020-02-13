package ds;

/**
 * Creating a dynamic Array as like javascript
 */

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }


    public void insert(int item) {
        // 1. if the array size is full, resize the array size
        if (items.length == count) {
            var newArray = new int[count * 2];

            // copy items to new Array
            int i = 0;
            for (int it : items) {
                newArray[i] = it;
                i++;
            }

            items = newArray;
        }
        // 2. Insert the new item at the rear.
        items[count++] = item;
    }


    public int length() {
        return count;
    }

    public void deleteAt(int index) {
        // 1. Validate index
        if (index < 0 || index >= count)
            throw new IllegalArgumentException("Index is out of range");

        // 1. Shift all items to rightward from index position
        for (int i = index; i < count; i++)
            items[i] = items[i + 1];
        count--; // now shrink the array size by one
    }


    /**
     * when find the item return the index otherwise -1
     * <p>
     * Best case: O(1)
     * Worst case: O(n)
     * Runtime complexity: O(n)
     */
    public int indexOf(int item) {
        int foundIndex = 0;
        for (int i = 0; i < count; i++) {
            if (items[i] == item) {
                foundIndex = i;
                break;
            }
        }
        return foundIndex;
    }
}
