package com.company;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    Map<String, String> dictionary = new HashMap<>();
    public void translate (String word){
        for (Map.Entry<String, String> entry : dictionary.entrySet()){
            if(dictionary.containsKey(word)){
                System.out.println(entry.getValue());
            }else{
                System.out.println("Sorry, I don't know such word");
            }
        }
    }
}
