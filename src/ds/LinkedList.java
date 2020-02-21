package ds;

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {
        private int valuel;
        private Node next;

        public Node(int value) {
            this.valuel = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    //addLast
    public void addLast(int item) {
        var node = new Node(item);

        if (first == null)
            first = last = node;
        else {
            last.next = node;
            last = node;
        }

        size++;
    }

    //addFirst
    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
        size++;
    }

    //deleteFirst
    public void deleteFirst() {

        if (isEmpty())
            throw new NoSuchElementException("List is empty");

        var secondNode = first.next;
        first.next = null;
        first = secondNode;
        size--;
    }

    //deleteLast
    public void deleteLast() {
        var secondLastNode = getPreviousNode(last);
        secondLastNode.next = null;
        last = secondLastNode;
        size--;
    }

    private Node getPreviousNode(Node node) {
        var current = first;
        while (current.next != null) {
            if (current.next == node)
                return current;
            current = current.next;
        }
        return null;
    }


    //contains
    public boolean contains(int item) {
        return indexOf(item) != -1;
    }


    //indexOf
    public int indexOf(int item) {
        var current = first;
        var index = 0;
        while (current != null) {
            if (current.valuel == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return size;
    }

    public int[] toArray()
    {
        int [] arryOfLinkedList = new int[size];
        int index = 0;
        Node current = first;
        while (current != null)
        {
            arryOfLinkedList[index++] = current.valuel;
            current = current.next;
        }
        return arryOfLinkedList;
    }


}
