package Hashmap;

import java.util.*;

public class HashMapBasics {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Insert key-value pairs
        map.put("Apple", 50);
        map.put("Banana", 20);
        map.put("Mango", 30);
        map.put("Orange", 80);
        map.put("Pears", 100);

        // Print entire map
        System.out.println("HashMap: " + map);

        // Access value using key
        System.out.println("Price of Mango: " + map.get("Mango"));

        // Update value
        map.put("Apple", 60);
        System.out.println("Updated Apple price: " + map.get("Apple"));

        // Check key existence
        if(map.containsKey("Banana")) {
            System.out.println("Banana exists in map");
        }

        // Remove a key
        map.remove("Banana");
        System.out.println("After removing Banana: " + map);

        // Iterate through keys
        System.out.println("Keys:");
        for(String key : map.keySet()) {
            System.out.println(key);
        }

        // Iterate through values
        System.out.println("Values:");
        for(Integer value : map.values()) {
            System.out.println(value);
        }

        // Iterate through key-value pairs
        System.out.println("Entries:");
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
