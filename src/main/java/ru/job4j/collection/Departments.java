package ru.job4j.collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        //List<String> rsl = new ArrayList<>();
        TreeSet<String> tmp = new TreeSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                start += el + "/";
                el = start;
                 tmp.add(el.substring(0, el.length() - 1));
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }

    public static void sortDesc(List<String> orgs) {
        orgs.sort((Comparator<? super String>) new DepDescComp());
    }
}
