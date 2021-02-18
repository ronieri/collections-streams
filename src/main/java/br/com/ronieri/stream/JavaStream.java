package br.com.ronieri.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class JavaStream {
    public static void main(String[] args) {
        List<String> alunos = new ArrayList<String>();

        alunos.add("Pedro");
        alunos.add("Thayse");
        alunos.add("Marcelo");
        alunos.add("Carla");
        alunos.add("Juliana");
        alunos.add("Thiago");
        alunos.add("Rafael");

        // Count
        System.out.println(alunos.stream().count());

        // Elemento com maior número de caracteres
        System.out.println(alunos.stream().max(Comparator.comparingInt(String::length)));

        // Elemento com menor número de letras
        System.out.println(alunos.stream().min(Comparator.comparingInt(String::length)));

        // Elementos que tem "R"
        System.out.println(alunos.stream().filter(
                (aluno) -> aluno.toLowerCase().contains("r")
        ).collect(Collectors.toList()));

        // Nome concatenado com tamanho - nova collection
        System.out.println(alunos.stream().map(
                (aluno) -> aluno.concat(String.valueOf(aluno.length()))
        ).collect(Collectors.toList()));

        // 3 primeiros elementos
        System.out.println(alunos.stream().limit(3).collect(Collectors.toList()));

        // Exibe cada element e retornando uma nova coleçao
        System.out.println(alunos.stream().peek(System.out::println).collect(Collectors.toList()));

        // Exibe cada elemento sem retornar uma nova coleçao
        alunos.stream().forEach(System.out::println);

        // allMatch
        System.out.println(alunos.stream().allMatch((aluno) -> aluno.contains("W")));

        // anyMatch
        System.out.println(alunos.stream().anyMatch((aluno) -> aluno.contains("a")));

        // noneMatch
        System.out.println(alunos.stream().noneMatch((aluno) -> aluno.contains("A")));

        // Primeiro elemento, se existir
        alunos.stream().findFirst().ifPresent(System.out::println);

        // Operação encadeada
        System.out.println(
                alunos.stream()
                .peek(System.out::println)
                .map(aluno ->
                        aluno.concat(" - ").concat(String.valueOf(aluno.length()))
                        )
                .peek(System.out::println)
                .filter(
                        aluno -> aluno.toLowerCase().contains("r")
                )
                //.collect(Collectors.toList())
                //.collect(Collectors.joining(", "))
                //.collect(Collectors.toSet())
                .collect(Collectors.groupingBy(
                        aluno -> aluno.substring(aluno.indexOf("-") + 1)
                ))
        );
    }
}
