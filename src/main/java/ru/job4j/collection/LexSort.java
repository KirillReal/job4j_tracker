package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int sort = 0;
        List<String> list1 = Arrays.asList(left.split("\\ "));
        List<String> list2 = Arrays.asList(right.split("\\ "));
            int listOne = Integer.parseInt(list1.get(0).substring(0, list1.get(0).length() - 1));
            int listTwo = Integer.parseInt(list2.get(0).substring(0, list2.get(0).length() - 1));
            sort = Integer.compare(listOne, listTwo);
        return sort;
    }
}
