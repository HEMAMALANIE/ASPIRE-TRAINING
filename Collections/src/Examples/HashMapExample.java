package Examples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(101, "Hema");
        employeeMap.put(102, "Hari");
        employeeMap.put(103, "Sathiya");

        System.out.println("Initial Employee Map: " + employeeMap);

        String employeeName = employeeMap.get(101);
        System.out.println("Employee with ID 101: " + employeeName);

        employeeMap.remove(102);
        System.out.println("After removing Employee ID 102: " + employeeMap);

        boolean hasID103 = employeeMap.containsKey(103);
        System.out.println("Contains Employee ID 103: " + hasID103);

        boolean hasNameHema = employeeMap.containsValue("Hema");
        System.out.println("Contains Employee named Hema: " + hasNameHema);

        System.out.println("Iterating over Employee Map:");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        employeeMap.clear();
        System.out.println("After clearing the map: " + employeeMap);
    }
}

