package com.omer.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Chuck Norris");
        list.add("Arif Pehlivan");
        list.add("Mario Jardel");
        Optional<List<String>> optList = Optional.of(list);
        optList.ifPresent(System.out::println);

        Optional<String> chuck = Optional.of("Chuck Norris");
        System.out.println(chuck.isPresent() ? "Chuck" : "Norris");

        Optional<String> test = Optional.of("Arif Pehlivan");
        test.map(String::length);

        Optional<String> chuck2 = Optional.of("Chuck Norris");
        chuck2.filter(i -> "Chuck Norris".equals(i)).ifPresent(System.out::println);
    }
}
