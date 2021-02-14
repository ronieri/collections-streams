package br.com.ronieri.set;

import java.util.Iterator;
import java.util.TreeSet;

public class JavaTreeSet {
    public static void main(String[] args) {
        TreeSet<String> capitals = new TreeSet<>();

        // Create a capital set
        capitals.add("Porto Alegre");
        capitals.add("Florianópolis");
        capitals.add("Curitiba");
        capitals.add("São Paulo");
        capitals.add("Rio de Janeiro");
        //capitals.add("Belo Horizonte");

        System.out.println(capitals);

        // First city of the tree
        System.out.println(capitals.first());

        // Last city of the tree
        System.out.println(capitals.last());

        // First city below param city
        System.out.println(capitals.lower("Florianópolis"));

        // First city above param city
        System.out.println(capitals.higher("Florianópolis"));

        // Return and remove first city
        System.out.println(capitals.pollFirst());

        System.out.println(capitals);

        // Return and remove last city
        System.out.println(capitals.pollLast());

        System.out.println(capitals);

        // Iterate over all cities using iterator
        Iterator<String> iterator = capitals.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Iterate over all cities using for loop
        for (String capital: capitals){
            System.out.println(capital);
        }
    }
}
