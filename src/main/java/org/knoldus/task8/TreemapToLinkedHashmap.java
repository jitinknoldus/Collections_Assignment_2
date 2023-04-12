package org.knoldus.task8;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreemapToLinkedHashmap {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Jitin",10);
        treeMap.put("Rahul",20);
        treeMap.put("Salil",30);
        treeMap.put("Sahil",40);

        Comparator<Map.Entry<String, Integer>> comparator = (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue());
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        treeMap.entrySet().stream()
                .sorted(comparator)
                .forEachOrdered(entry -> linkedHashMap.put(entry.getKey(), entry.getValue()));

        System.out.println("Sorted entries:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}
