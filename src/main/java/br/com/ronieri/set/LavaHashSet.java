package br.com.ronieri.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LavaHashSet {
    public static void main(String[] args) {
        Set<Double> grades = new HashSet<>();

        //Adding grades
        grades.add(5.8);
        grades.add(9.3);
        grades.add(6.5);
        grades.add(10.0);
        grades.add(5.4);
        grades.add(7.3);
        grades.add(3.8);
        grades.add(4.0);

        grades.add(4.0);

        System.out.println(grades);

        // Remove grades from the set
        grades.remove(3.8);

        System.out.println(grades);

        // Number of grades in the set
        System.out.println(grades.size());

        // Iterate over all set items using iterator
        Iterator<Double> iterator = grades.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Iterate over all set items using for loop
        for (Double grade: grades){
            System.out.println(grade);
        }

        // Remove all grades from the set
        grades.clear();

        // Check if set is empty
        System.out.println(grades.isEmpty());
    }
}
