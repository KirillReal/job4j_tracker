package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int sort = 0;
        List<String> list1 = Arrays.asList(left.split(" "));
        List<String> list2 = Arrays.asList(right.split(" "));
        int i = 0;
        do{
            int listOne = Integer.parseInt(list1.get(i).substring(0,list1.get(i).length()-1));
            int listTwo = Integer.parseInt(list2.get(i).substring(0,list2.get(i).length()-1));
            sort = Integer.compare(listOne,listTwo);
            i++;
        }while(i < 1);
        return sort;
    }
}
