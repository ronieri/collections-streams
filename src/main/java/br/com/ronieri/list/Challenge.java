package br.com.ronieri.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * *Crie uma lista e execute as seguintes operações:
 *      1  Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João
 *      2  Navegue na lista exibindo cada nome no console
 *      3  Substitua o nome de Carlos por Roberto
 *      4  Retorne o nome da posição 1
 *      5  Remova o nome da posição 4
 *      6  Remova o nome João
 *      7  Retorn a quantidade de itens na lista
 *      8  Verifique se o nome Juliano existe na lista
 *      9  Crie uma nova lista com os nomes: Ismael e Rodrigo. Adicione todos os itens da nova lista na lista criada
 *      10 Ordene os itens da lista por ordem alfabética
 *      11 Verifique se a lista está vazia
 * */
public class Challenge {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<String>();

        // 1
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        System.out.println(nomes);

        // 2
        for (String nome: nomes){
            System.out.println(nome);
        }

        // 3
        nomes.set(nomes.indexOf("Carlos"), "Roberto");
        System.out.println(nomes);

        // 4
        System.out.println(nomes.get(1));

        // 5
        nomes.remove(4);
        System.out.println(nomes);

        // 6
        nomes.remove("João");
        System.out.println(nomes);

        // 7
        System.out.println(nomes.size());

        // 8
        System.out.println(nomes.contains("Juliano"));

        // 9
        List<String> nova = new ArrayList<String>();
        nova.add("Ismael");
        nova.add("Rodrigo");
        nomes.addAll(nova);
        System.out.println(nomes);

        // 10
        Collections.sort(nomes);
        System.out.println(nomes);

        // 11
        System.out.println(nomes.isEmpty());
    }
}
