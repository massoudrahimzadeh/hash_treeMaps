package com.company;

import java.util.HashMap;
import java.util.Map;

public class PizzaMenu {
    Map<String, Integer> pizzaMenu = new HashMap<>();
    public Map<String, Integer> isAffordable(double cashInPacket){
        Map<String, Integer> iCanBuy = new HashMap<>();
        for (Map.Entry<String, Integer> entry : pizzaMenu.entrySet()) {
            if(entry.getValue()<= (int)cashInPacket){
                iCanBuy.put(entry.getKey(),entry.getValue());
            }
        }
        return iCanBuy;

        }

}
