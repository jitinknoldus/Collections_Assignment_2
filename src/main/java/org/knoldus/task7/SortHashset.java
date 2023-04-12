package org.knoldus.task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SortHashset {
    public static void main(String[] args) {
        HashSet<String> stringSet = new HashSet<>();
        stringSet.add("Jitin");
        stringSet.add("Salil");
        stringSet.add("Rahul");
        stringSet.add("Rishika");
        stringSet.add("Riya");

        List<String> sortedList = new ArrayList<>(stringSet);
        Collections.sort(sortedList, Collections.reverseOrder());

        System.out.println("Sorted strings in descending order:");
        for (String string : sortedList) {
            System.out.println(string);
        }

        }
}
