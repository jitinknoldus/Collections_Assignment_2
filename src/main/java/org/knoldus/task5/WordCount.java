package org.knoldus.task5;

import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        // Creating a HashMap with some words and their frequency counts
        HashMap<String, Integer> wordCounts = new HashMap<>();
        wordCounts.put("UP", 158);
        wordCounts.put("Bihar", 206);
        wordCounts.put("Delhi", 2);
        wordCounts.put("Gurugram", 5);
        wordCounts.put("Gujarat", 1);
        wordCounts.put("Rajasthan", 3);

        // Sorting the entries in the HashMap by values in descending order using a Comparator
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(wordCounts.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> entryMap1, Map.Entry<String, Integer> entryMap2) {
                Integer value1 = entryMap1.getValue();
                Integer value2 = entryMap2.getValue();
                return value2.compareTo(value1);
            }
        });

        // Printing the top 10 most frequent words
        for (int indexOfList = 0; indexOfList < 10 && indexOfList < entryList.size(); indexOfList++) {
            Map.Entry<String, Integer> entry = entryList.get(indexOfList);
            String word = entry.getKey();
            int count = entry.getValue();
            System.out.println(word + " : " + count);
        }
    }
}
