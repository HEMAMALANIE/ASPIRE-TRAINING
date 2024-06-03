package Examples;

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> nameAgeMap = new TreeMap<>();

        nameAgeMap.put("Hari", 25);
        nameAgeMap.put("Hema", 30);
        nameAgeMap.put("Sathiya", 28);

        System.out.println("Initial TreeMap: " + nameAgeMap);

        nameAgeMap.put("Ravi", 35);
        System.out.println("After adding Ravi: " + nameAgeMap);

        int hemaAge = nameAgeMap.get("Hema");
        System.out.println("Hema's age: " + hemaAge);

        nameAgeMap.remove("Hema");
        System.out.println("After removing Hema: " + nameAgeMap);

        boolean containsSathiya = nameAgeMap.containsKey("Sathiya");
        System.out.println("Contains Sathiya: " + containsSathiya);

        System.out.println("Iterating over the map:");
        for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        nameAgeMap.clear();
        System.out.println("After clearing the map: " + nameAgeMap);
    }
}

