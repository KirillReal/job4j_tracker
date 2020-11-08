package ru.job4j.list;

import java.util.List;

public class CheckerAhdGetter {
    public static String getElement(List<String> list) {
        String one = "";
        if(!list.isEmpty()) {
            one = list.get(0);
        }
        return one;
    }
}
