package com.company;

import java.awt.*;
import java.util.*;
import java.util.List;

public class PeppaPig {
    Map<String, Set<String>> friendCircle = new HashMap<>();


    public PeppaPig() {
        Set a= new HashSet();
        a.add("Suzy Sheep");
        a.add("Emily Elephant");
        a.add("Rebecca Rabbit");
        a.add("Danny Dog");
        a.add("Pedro Pony");
        Set b= new HashSet();
        b.add("Freddy Fox");
        b.add("Gabriella Goat");
        b.add("Rebecca Rabbit");
        b.add("Danny Dog");
        b.add("Kylie Kangaroo");

        friendCircle.put("Peppa Pig", a);
        friendCircle.put("Zoe Zebra", b);
    }

    public void findMutualFriends(){
        Map<String, Set<String>> mutualFriends = new HashMap<>();
        Set set1= friendCircle.get("Peppa Pig");
        Set set2 = friendCircle.get("Zoe Zebra");

        Set<String> intersection = new HashSet<String>(set1);
        intersection.retainAll(set2);
        mutualFriends.put("Mutual friends", intersection);
        System.out.println(intersection);
    }
}
