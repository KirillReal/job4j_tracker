package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Article {
    public static boolean generateBy(String origin, String line) {
        boolean check = true;
        String origin1 = origin.replaceAll("[-+.^:,!]"," ");
        String line1 = line.replaceAll("[-+.^:,!]"," ");
        String[] lineMass = line1.split(" ");
        String[] originMass = origin1.split(" ");
        List<String> originList = new ArrayList<>(Arrays.asList(originMass));
        List<String> lineList = new ArrayList<>(Arrays.asList(lineMass));
        for (String el : lineList) {//0(N)
            if ((!originList.contains(el))) { //O(N)
                check = false;
                break;
            }
        }
        return check;
    }
}//Сложность алгоритма 0(N^2)