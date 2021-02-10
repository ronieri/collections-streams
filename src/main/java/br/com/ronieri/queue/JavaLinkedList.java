package br.com.ronieri.queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class JavaLinkedList {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Patrícia");
        fila.add("Roberto");
        fila.add("Flávio");
        fila.add("Pamela");
        fila.add("Anderson");

        System.out.println(fila);

        // Method poll - get the first element and remove it
        String poll = fila.poll();
        System.out.println(poll);
        System.out.println(fila);

        // Method peek - return the first element without removing it - null if empty
        String peek = fila.peek();
        System.out.println(peek);
        System.out.println(fila);

        // Method element - return the first element without removing it, throws noSuchElementException if empty
//        fila.clear();
//        String element = fila.element();
//        System.out.println(element);
    }
}
