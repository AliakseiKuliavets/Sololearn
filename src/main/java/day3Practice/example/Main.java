package day3Practice.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = List.of("Alice", "Bob", "Charlie");

        names.stream()
                        .

                filter(name -> name.endsWith("e"))
                        .

                forEach(System.out::println);
    }
}

