package br.com.ronieri.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * *Crie uma fila e execute as seguintes operações:
 *      1  Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João
 *      2  Navegue na fila exibindo cada nome no console
 *      3  Retorne o primeiro item da fila, sem removê-lo
 *      4  Retorne o primerio item da fila, removendo o mesmo
 *      5  Adicione um novo nome: Daniel. Verifque a posição que o mesmo assumiu na fila
 *      6  Retorn o tamanho da fila
 *      7  Verifique se a fila está vazia
 *      8  Verifique se o nome Carlos está na fila
 * */
public class Challenge {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<String>();

        // 1
        fila.add("Juliana");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("João");

        System.out.println(fila);

        // 2
        for (String nome: fila){
            System.out.println(nome);
        }

        // 3
        System.out.println(fila.peek());
        System.out.println(fila);

        // 4
        System.out.println(fila.poll());
        System.out.println(fila);

        // 5
        fila.add("Daniel");
        System.out.println(fila);

        // 6
        System.out.println(fila.size());

        // 7
        System.out.println(fila.isEmpty());

        // 8
        System.out.println(fila.contains("Carlos"));
    }
}
