package br.com.ronieri.optional;

import java.util.Optional;

public class JavaOptional {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Valor presente");

        System.out.println("Valor opcional que está presente");
        optional.ifPresentOrElse(System.out::println, () -> System.out.println("Não est presente"));

        Optional<String> optionalNull = Optional.ofNullable("Carla");

        System.out.println("Valor opcional que nao esta presente - Null");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("Null"));

        Optional<String> optionalEmpty = Optional.empty();

        System.out.println("Valor opcional vazio");
        optionalEmpty.ifPresentOrElse(System.out::println, () -> System.out.println("Empty"));

        //Optional<String> optionalNullErro = Optional.of(null);

        System.out.println("Valor opcional que lanca erro NullPointerException");
        //optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro"));
    }
}
