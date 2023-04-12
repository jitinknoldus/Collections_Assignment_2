package org.knoldus.task2;

import java.util.HashMap;
import java.util.Map;

public class StudentsHashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> gradeMap = new HashMap<>();
        gradeMap.put("Jitin", 84);
        gradeMap.put("Salil", 90);
        gradeMap.put("Rishika", 98);
        gradeMap.put("Rahul", 88);


        // Calculate the average grade for all students in the HashMap
        int finalGrade = 0;
        for (Map.Entry<String, Integer> entry : gradeMap.entrySet()) {
            finalGrade += entry.getValue();
        }
        double averageGrade = finalGrade / (double) gradeMap.size();
        System.out.println("The average grade is " + averageGrade);
    }
}
