package br.com.ronieri.map;

import java.util.TreeMap;

public class JavaTreeMap {
    public static void main(String[] args) {

        TreeMap<String, String> capitals = new TreeMap<>();

        // Create a capital set
        capitals.put("RS", "Porto Alegre");
        capitals.put("SC", "Florianópolis");
        capitals.put("PR", "Curitiba");
        capitals.put("SP", "São Paulo");
        capitals.put("RJ", "Rio de Janeiro");
        capitals.put("MG", "Belo Horizonte");

        System.out.println(capitals);


        System.out.println(capitals.firstKey());

        System.out.println(capitals.lastKey());

        System.out.println(capitals.lowerKey("SC"));

        System.out.println(capitals.higherKey("SC"));

        System.out.println(capitals.firstEntry().getKey() + " - " + capitals.firstEntry().getValue());

    }
}
