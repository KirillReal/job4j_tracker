package ru.job4j.tracker.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamAPI {

    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(10);
        numList.add(-12);
        numList.add(21);
        List<Integer> numOfPositive = numList.stream().filter(
                num -> num > 0).collect(Collectors.toList());
        numOfPositive.forEach(System.out::println);
    }
}