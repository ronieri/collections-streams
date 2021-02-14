package br.com.ronieri.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class JavaLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer>  sequence = new LinkedHashSet<>();

        // Adding numbers in to the set
        sequence.add(16);
        sequence.add(2);
        sequence.add(8);
        sequence.add(4);
        sequence.add(1);

        System.out.println(sequence);

        // Removing number
        sequence.remove(4);

        System.out.println(sequence);

        // Set size
        System.out.println(sequence.size());

        // Iterates over all set items using iterator
        Iterator<Integer> iterator = sequence.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Iterates over all set items using for loop
        for (Integer integer: sequence){
            System.out.println(integer);
        }

        sequence.clear();

        // Check if the set is empty
        System.out.println(sequence.isEmpty());
    }
}
