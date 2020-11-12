package ru.job4j.collection;

import java.util.HashMap;
public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("kirill2341@yandex.ru", "Kirill Danilov");
        map.put("sergeybron35421@gmail.com", "Sergey Bronnikov");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
