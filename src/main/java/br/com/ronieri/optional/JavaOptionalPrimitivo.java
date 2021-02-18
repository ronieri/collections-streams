package br.com.ronieri.optional;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class JavaOptionalPrimitivo {
    public static void main(String[] args) {
        System.out.println("Optional for int");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("Optional for double");
        OptionalDouble.of(25.5).ifPresent(System.out::println);
        OptionalDouble d = OptionalDouble.of(25.5);

        System.out.println("Optional for long");
        OptionalLong.of(23L).ifPresent(System.out::println);
    }
}
