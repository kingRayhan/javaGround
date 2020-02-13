package ds;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    // addFirst
    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
    }

    // addLast
    public void addLast(int item) {
        // create a node
        // node { value: item , next: null }
        var node = new Node(item);

        if(isEmpty())
        /**
         * first = { value: item , next: null }
         * last = { value: item , next: null }
         */
            first = last = node;
        else{
            // add the node after last node :D
            last.next = node;
            last = node;
        }


    }


    private boolean isEmpty() {
        return first == null;
    }

    // deleteFirst
    // contains


    // indexOf
    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item)
                return index;
            current = current.next;
            index++;
        }

        return -1;
    }


    // print
    public void print() {
        var current = first;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
}
