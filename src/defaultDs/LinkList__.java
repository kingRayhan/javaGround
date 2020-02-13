package defaultDs;

import utils.Utils;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkList__ {
    public LinkList__() {
        LinkedList list = new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);


        Utils.lines("LinkedList");
        System.out.println("Size:            " + list.size());
        System.out.println("list:            " + list);
        System.out.println("Array.toString():" + Arrays.toString(list.toArray()));
        System.out.println("lastIndexOf:     " + list.lastIndexOf(10));
        System.out.println("IndexOf:         " + list.indexOf(20));
        System.out.println("10 contains:     " + list.contains(10));
    }
}
