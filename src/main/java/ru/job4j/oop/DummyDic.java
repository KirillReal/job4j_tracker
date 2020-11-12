package ru.job4j.oop;

public class DummyDic {
    public static String engToRus(String eng) {
        return "Неизвестное слово " + eng;
    }

    public static void main(String[] args) {
        String hi = "Hi";
        String say = engToRus(hi);
        System.out.println(say);
    }
}
