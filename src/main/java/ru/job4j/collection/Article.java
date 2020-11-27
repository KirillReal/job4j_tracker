package ru.job4j.collection;

import java.util.*;

public class Article {
    public static boolean generateBy(String origin, String line) {
        boolean check = true;
        String origin1 = origin.replaceAll("[-+.^:,!]", " ");
        String line1 = line.replaceAll("[-+.^;,!]", " ");
        String[] lineMass = line1.split(" ");
        String[] originMass = origin1.split(" ");
        List<String> originList = new ArrayList<>(Arrays.asList(originMass));
        List<String> lineList = new ArrayList<>(Arrays.asList(lineMass));
        Set set = new HashSet(originList);
        for (String el: lineList) {
            if ((!set.contains(el))) {
                check = false;
                break;
            }
        }
        return check;
    }
}