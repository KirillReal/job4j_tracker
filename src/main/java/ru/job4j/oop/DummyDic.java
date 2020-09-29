package ru.job4j.oop;

public class DummyDic {
    public static String engToRus(String eng) {
        String word = "Неизвестное слово " + eng;
        return word;
    }
    public static void main(String[] args) {
        String Hi = "Hi";
        String say = engToRus(Hi);
        System.out.println(say);
    }
}
