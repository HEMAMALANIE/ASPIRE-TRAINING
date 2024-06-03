package Examples;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> namesSet = new HashSet<>();
        namesSet.add("Hema");
        namesSet.add("Hari");
        namesSet.add("Sathiya");
        System.out.println("Initial Names Set: " + namesSet);
        namesSet.add("Hema");
        System.out.println("Names Set after adding a duplicate: " + namesSet);
        namesSet.remove("Hari");
        System.out.println("Names Set after removing Hari: " + namesSet);
        boolean hasSathiya = namesSet.contains("Sathiya");
        System.out.println("Does the set contain Sathiya? " + hasSathiya);
        int setSize = namesSet.size();
        System.out.println("Size of the Names Set: " + setSize);
        System.out.println("Iterating over the Names Set:");
        for (String name : namesSet) {
            System.out.println(name);
        }
        namesSet.clear();
        System.out.println("After clearing the set: " + namesSet);
    }
}

