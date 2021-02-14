package br.com.ronieri.map;

import java.util.HashMap;

public class Challenge {
    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<>();

        // Create a capital set
        capitals.put("RS", "Porto Alegre");
        capitals.put("PB", "João Pessoa");
        capitals.put("TO", "Palmas");
        capitals.put("RJ", "Rio de Janeiro");

//        //capitals.put("RS", "Gravataí");
//        capitals.put(null, "São Paulo");
//        capitals.put(null, "Florianópolis");
//
//        System.out.println(capitals);
//
//        System.out.println(capitals.get(3));

//        capitals.put("GO", null);
//        capitals.put("RO", null);
//
//        System.out.println(capitals);

        capitals.put("AM", "Manaus");

        System.out.println(capitals);
    }
}
