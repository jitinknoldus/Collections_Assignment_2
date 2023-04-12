package org.knoldus.task1;

import java.util.HashMap;
import java.util.Scanner;

public class NamesHashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        map.put("Jitin", 22);
        map.put("Salil", 23);
        map.put("Rahul", 24);
        map.put("Anshika", 21);
        map.put("Riya", 23);

        System.out.println("Iterating Hashmap :");
        for (String name : map.keySet()) {
            int age = map.get(name);
            System.out.println(name + " : " + age);
        }
    }
}
