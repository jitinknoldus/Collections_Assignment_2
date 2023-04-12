package org.knoldus.task4;

import java.util.HashMap;
import java.util.Map;

public class EmployeeSalary {
    public static void main(String[] args) {
        HashMap<String,Double> employee = new HashMap<>();
        employee.put("Jitin",45000.00);
        employee.put("Salil",54000.00);
        employee.put("Anshika",38000.00);
        employee.put("Riya",47000.00);
        employee.put("Rahul",26000.00);

        System.out.println("Salary before increment: ");
        for(Map.Entry<String, Double> entry: employee.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        //incrementing salaries
        for(Map.Entry<String,Double> entry : employee.entrySet()){
            if(entry.getValue()<50000.00){
                double newSalary = entry.getValue() + (entry.getValue()*0.05);
                employee.put(entry.getKey(), newSalary);
            }
        }

        System.out.println("\nSalaries after increment: ");
        for(Map.Entry<String, Double> entry: employee.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }



    }
}
