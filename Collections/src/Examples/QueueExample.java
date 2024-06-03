package Examples;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Employee> employeeQueue = new LinkedList<>();

        employeeQueue.add(new Employee(101, "HEMA"));
        employeeQueue.add(new Employee(102, "JAYASRI"));
        employeeQueue.add(new Employee(103, "SATHIYA"));

        System.out.println("Initial Employee Queue: " + employeeQueue);

        Employee firstEmployee = employeeQueue.poll();
        System.out.println("Processing Employee: " + firstEmployee);

        System.out.println("Remaining Employee Queue: " + employeeQueue);

        Employee nextEmployee = employeeQueue.peek();
        System.out.println("Next Employee to be processed: " + nextEmployee);

        System.out.println("Remaining Employee Queue Size: " + employeeQueue.size());

        System.out.println("Iterating over remaining employees:");
        for (Employee employee : employeeQueue) {
            System.out.println(employee);
        }

        employeeQueue.clear();
        System.out.println("After clearing the queue: " + employeeQueue);
    }
}

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name;
    }
}

