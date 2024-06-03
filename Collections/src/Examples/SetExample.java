package Examples;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }

   
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

   
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class SetExample {
    public static void main(String[] args) {
        Set<Employee> employees = new HashSet<>();
        
        employees.add(new Employee(101, "HEMA"));
        employees.add(new Employee(102, "BENIN"));
        employees.add(new Employee(103, "CHARU"));
        employees.add(new Employee(102, "PRIYA"));  // Duplicate employee

        System.out.println("Employees: " + employees);

        boolean hasEmployee101 = employees.contains(new Employee(101, "HEMA"));
        System.out.println("Contains Employee with ID 101: " + hasEmployee101);

        employees.remove(new Employee(103, "CHARU"));
        System.out.println("After removing Employee with ID 103: " + employees);

        System.out.println("Iterating over Employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

