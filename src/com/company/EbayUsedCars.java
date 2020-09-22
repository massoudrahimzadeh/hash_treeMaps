package com.company;

import java.util.*;

public class EbayUsedCars {
    Map<String, List<Double>> ebayCars = new HashMap<>();
    public Map<String, Double> getAverage(){
        Map<String, Double> carAvgPrice = new HashMap<>();
        for (Map.Entry<String, List<Double>> entry : ebayCars.entrySet()) {
            List<Double> prices = new ArrayList<>();
            prices = entry.getValue();
            double p=0;
            for(Double price:prices){
                p+=price;
            }
            carAvgPrice.put(entry.getKey(), (p/prices.size()));
        }
        return  carAvgPrice;
        }
}
