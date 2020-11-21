package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        ArrayList integers = (ArrayList) List.of(
                new ArrayList<Integer>(10),
                new ArrayList<Integer>(-29),
                new ArrayList<Integer>(57),
                new ArrayList<Integer>(-42),
                new ArrayList<Integer>(20)
        );
        List<Integer> filter = integers.stream().filter(
                integer -> integer > 0).collect(Collectors.toList());
    }
}
