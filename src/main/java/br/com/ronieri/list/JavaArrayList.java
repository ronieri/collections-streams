package br.com.ronieri.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class JavaArrayList {
    public static void main(String[] args) {
        // Names list
        List<String> names = new ArrayList<>();

        names.add("Ronieri");
        names.add("Maria");
        names.add("João");

        System.out.println(names); // [Ronieri, Maria, João]

        // Sorting list using collections class
        Collections.sort(names);
        System.out.println(names); // [João, Maria, Ronieri]

        // Set method - altering data by index
        names.set(2, "Sales");
        System.out.println(names); // [João, Maria, Sales]

        // Removing element by index
        names.remove(2);
        System.out.println(names); // [João, Maria]

        // Removing element by object(String)
        names.remove("Maria");
        System.out.println(names); // [João]

        names.add("Ronieri");
        names.add("Maria");
        System.out.println(names); // [João, Ronieri, Maria]

        // Get element by index
        String name = names.get(1);
        System.out.println(name); // Ronieri

        // List size
        int size = names.size();
        System.out.println(size); // 3

        // Check if list contains element
        boolean contains = names.contains("Ronieri");
        System.out.println(contains); // true

        // Check if list it's empty
        System.out.println(names.isEmpty()); // false

        // Index of an element
        System.out.println(names.indexOf("Maria")); // 2
        System.out.println(names.indexOf("Pedro")); // -1

        System.out.println("\n\nIteration\nFor loop:");
        // Iterating over list using for loop
        for (String n: names){
            System.out.println(n);
        }

        System.out.println("\nIterator with while loop:");
        // Iterating over list using iterator with while
        Iterator<String> iter = names.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
