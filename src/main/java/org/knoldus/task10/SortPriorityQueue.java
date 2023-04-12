package org.knoldus.task10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class SortPriorityQueue {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(16);
        list.add(20);
        list.add(32);
        list.add(74);
        list.add(69);

        PriorityQueue<Integer> queue = new PriorityQueue<>(list);
        ArrayList<Integer> sortedList = new ArrayList<>();
        while (!queue.isEmpty()) {
            sortedList.add(queue.poll());
        }

        Collections.reverse(sortedList);

        System.out.println(sortedList);
    }
}
