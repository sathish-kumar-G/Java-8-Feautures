package com.demo.forEach;

import java.util.HashMap;
import java.util.Map;

public class ForEachMapExamble {
    public static void main(String[] args) {
        //Create Map
        Map<Integer,Person> maps = new HashMap<>();
        maps.put(1,new Person("sathish",25));
        maps.put(2,new Person("kumar",22));
        maps.put(3,new Person("akash",20));
        maps.put(4,new Person("manoj",19));
        //Normal way
        for(Map.Entry<Integer,Person> map: maps.entrySet()){
            System.out.println(map.getKey());
            System.out.println(map.getValue().getName());
        }
        //Using Lambda
        maps.forEach((k,v) ->{
            System.out.println(k);
            System.out.println(v.getName());
        });

    }
}
