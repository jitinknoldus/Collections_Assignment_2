package org.knoldus.task3;

import java.util.HashMap;
import java.util.Map;

public class HighestStockPrice {
    public static void main(String[] args) {
        HashMap<String, Double> stocks = new HashMap<>();
        stocks.put("Tatapower", 254.96);
        stocks.put("Adanipower", 2504.96);
        stocks.put("Reliance", 2254.96);
        stocks.put("Bajafinance", 568.92);


        String highestStockSymbol = null;
        double highestStockPrice = Double.MIN_VALUE;
        for (Map.Entry<String, Double> entry : stocks.entrySet()) {
            if (entry.getValue() > highestStockPrice) {
                highestStockSymbol = entry.getKey();
                highestStockPrice = entry.getValue();
            }
        }

        System.out.println("The stock with the highest price is: " + highestStockSymbol);
    }
}
