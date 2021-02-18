package br.com.ronieri.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge {
    public static void main(String[] args) {

        List<String> frutas = new ArrayList<String>();

        frutas.add("Maçã");
        frutas.add("Laranja");
        frutas.add("Banana");
        frutas.add("Limão");

        System.out.println(frutas.stream().anyMatch(fruta -> fruta.contains("X")));

        System.out.println(frutas.stream().min(Comparator.comparingInt(String::length)));

        System.out.println(frutas.stream().filter(fruta -> fruta.length() > 5 ).collect(Collectors.toList()));

        System.out.println(frutas.stream().max(Comparator.comparingInt(String::length)));

        System.out.println(frutas.stream().collect(Collectors.groupingBy(fruta -> fruta.substring(0, 1))));

        System.out.println(frutas.stream().min(Comparator.comparingInt(String::length)));

        System.out.println(frutas.stream().count());

        System.out.println(frutas.stream().noneMatch(fruta -> fruta.length() >= 10));

        System.out.println(frutas.stream().map(fruta -> fruta + " - " + (fruta.length() * 2).collect(Collectors.toList()));
    }
}
