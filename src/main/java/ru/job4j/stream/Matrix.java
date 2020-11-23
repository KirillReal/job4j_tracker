package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Matrix {
    public static void main(String[] args) {
        Integer[][] matrix = {{1,2},{3,4}};
        for (Integer[] i:
             matrix) {
            for (Integer ignored :
                 i) {
                System.out.println(Arrays.toString(i));
            }
        }
        List<Integer> result = Arrays.stream(matrix).flatMap(Arrays::stream).collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
