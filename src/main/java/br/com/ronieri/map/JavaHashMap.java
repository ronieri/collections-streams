package br.com.ronieri.map;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMap {
    public static void main(String[] args) {
        Map<String, Integer> fifaChampions = new HashMap<>();

        fifaChampions.put("Brasil", 5);
        fifaChampions.put("Alemanha", 4);
        fifaChampions.put("Itália", 4);
        fifaChampions.put("Uruguai", 2);
        fifaChampions.put("Argentina", 2);
        fifaChampions.put("França", 2);
        fifaChampions.put("Inglaterra", 1);
        fifaChampions.put("Espanha", 1);

        System.out.println(fifaChampions);

        // Update
        fifaChampions.put("Brasil", 6);

        System.out.println(fifaChampions);

        System.out.println(fifaChampions.get("Argentina"));

        System.out.println(fifaChampions.containsKey("França"));

        fifaChampions.remove("França");

        System.out.println(fifaChampions);

        System.out.println(fifaChampions.containsKey("França"));

        System.out.println(fifaChampions.containsValue(6));

        System.out.println(fifaChampions.size());

        System.out.println(fifaChampions);


        for (Map.Entry<String, Integer> entry: fifaChampions.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        for (String key: fifaChampions.keySet()){
            System.out.println(key + " > " + fifaChampions.get(key));
        }
    }
}
