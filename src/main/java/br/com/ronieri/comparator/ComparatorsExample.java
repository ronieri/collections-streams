package br.com.ronieri.comparator;

import java.util.*;

public class ComparatorsExample {
    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<Estudante>();

        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Mariana", 21));
        estudantes.add(new Estudante("João", 18));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));

        System.out.println(estudantes);

        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());

        System.out.println(estudantes);

        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());

        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));

        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());

        System.out.println(estudantes);

        Collections.sort(estudantes);

        System.out.println(estudantes);

        Collections.sort(estudantes, new OrdemInversaEstudandeComparator());

        System.out.println(estudantes);
    }
}
