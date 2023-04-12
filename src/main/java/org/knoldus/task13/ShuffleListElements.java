package org.knoldus.task13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleListElements {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(25);
        list.add(54);
        list.add(56);
        list.add(99);
        list.add(19);
        list.add(2);

        System.out.println("Original List: " + list);

        Collections.shuffle(list);

        System.out.println("Shuffled List: "+list);

    }
}
