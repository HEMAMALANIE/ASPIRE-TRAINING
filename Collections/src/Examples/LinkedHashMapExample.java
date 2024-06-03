package Examples;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> ageMap = new LinkedHashMap<>();

        ageMap.put("Hema", 25);
        ageMap.put("Hari", 30);
        ageMap.put("Sathiya", 28);

        System.out.println("Initial LinkedHashMap: " + ageMap);

        int hariAge = ageMap.get("Hari");
        System.out.println("Age of Hari: " + hariAge);

        ageMap.remove("Hema");
        System.out.println("After removing Hema: " + ageMap);

        boolean containsSathiya = ageMap.containsKey("Sathiya");
        System.out.println("Contains Sathiya: " + containsSathiya);

        System.out.println("Size of LinkedHashMap: " + ageMap.size());

        System.out.println("Iterating over the LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }

        ageMap.clear();
        System.out.println("After clearing the LinkedHashMap: " + ageMap);
    }
}

