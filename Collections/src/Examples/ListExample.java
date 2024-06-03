package Examples;
import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> employeeIDs = new ArrayList<>();
        
        employeeIDs.add(101);
        employeeIDs.add(102);
        employeeIDs.add(103);
        System.out.println("Initial Employee IDs: " + employeeIDs);

        int firstEmployeeID = employeeIDs.get(0);
        System.out.println("First Employee ID: " + firstEmployeeID);

        employeeIDs.remove(Integer.valueOf(102));
        System.out.println("After removing Employee ID 102: " + employeeIDs);

        boolean hasID103 = employeeIDs.contains(103);
        System.out.println("Contains Employee ID 103: " + hasID103);

        int size = employeeIDs.size();
        System.out.println("List size: " + size);

        System.out.println("Iterating over Employee IDs:");
        for (int id : employeeIDs) {
            System.out.println(id);
        }

        employeeIDs.clear();
        System.out.println("After clearing the list: " + employeeIDs);
    }
}
