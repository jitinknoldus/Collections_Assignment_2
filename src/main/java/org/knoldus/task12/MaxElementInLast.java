package org.knoldus.task12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxElementInLast {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(54);
        list.add(56);
        list.add(99);
        list.add(19);
        list.add(2);

        int maxElement = Collections.max(list);

        System.out.println("The maximum value is " + maxElement);

    }
}
