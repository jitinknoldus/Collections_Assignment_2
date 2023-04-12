package org.knoldus.task9;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class CustomObject {
    private String name;

    public CustomObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class SortLinkedList {
    public static void main(String[] args) {
        LinkedList<CustomObject> list = new LinkedList<>();
        list.add(new CustomObject("David"));
        list.add(new CustomObject("John"));
        list.add(new CustomObject("Jack"));

        // Sort the LinkedList in alphabetical order by "name" field
        Collections.sort(list, new Comparator<CustomObject>() {
            @Override
            public int compare(CustomObject o1, CustomObject o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        // Print the sorted LinkedList
        for (CustomObject obj : list) {
            System.out.println(obj.getName());
        }

    }
}
