package java8_practice;

import java.util.function.Consumer;

public class ConsumerFunctionalInterface {

    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("Anish");
    }
}
