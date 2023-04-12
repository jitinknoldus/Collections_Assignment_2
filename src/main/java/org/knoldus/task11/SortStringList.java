package org.knoldus.task11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStringList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Jitin");
        list.add("Salil");
        list.add("Riya");
        list.add("Anshika");

        Collections.sort(list);

        System.out.println("List is: " + list);

    }
}
