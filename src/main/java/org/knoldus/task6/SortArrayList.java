package org.knoldus.task6;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(56);
        list.add(24);
        list.add(2);
        list.add(92);
        list.add(89);
        list.add(62);

        System.out.println("List before sorting: ");
        System.out.println(list);

        Collections.sort(list);

        System.out.println("\nList after sorting: ");
        System.out.println(list);
    }
}
