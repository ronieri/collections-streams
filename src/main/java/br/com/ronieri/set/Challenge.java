package br.com.ronieri.set;

import java.util.Collections;
import java.util.HashSet;

/**
 * Crie um set e execute as seguintes operações:
 *  1 - Adicione 5 números inteiros
 *  2 - Navegue no set exibindo cada número no console
 *  3 - Remova o primeiro item do set
 *  4 - Adicione um novo número no set: 23
 *  5 - Verifique o tamanho do set
 *  6 - Verifique se o set está vazio
 * */
public class Challenge {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(4);
        hashSet.add(2);
        hashSet.add(23);
        hashSet.add(14);
        hashSet.add(55);

        //Collections.sort(hashSet);

        System.out.println(hashSet);
        hashSet.add(44);
        System.out.println(hashSet);
    }
}
