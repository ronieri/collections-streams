package br.com.ronieri.list;

import java.util.List;
import java.util.Vector;

public class JavaVector {
    public static void main(String[] args) {
        List<String> sports = new Vector<>();

        sports.add("Baseball");
        sports.add("Football");
        sports.add("Basketball");
        sports.add("Soccer");

        // Changing element by index
        sports.set(3, "Handball");

        // Removing element by index
        sports.remove(1);

        // Removing element by object
        sports.remove("Handball");

        // Getting vector's first element
        System.out.println(sports.get(0));

        // Iterating over sports vector
        System.out.println();
        for (String sport: sports){
            System.out.println(sport);
        }
    }
}
