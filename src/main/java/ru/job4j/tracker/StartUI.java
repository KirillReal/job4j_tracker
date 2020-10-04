package ru.job4j.tracker;
import javax.imageio.ImageTranscoder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class StartUI {
    public static void main(String[] args) {
        Item obj = new Item(1,"John");
        System.out.println(obj);
    }
}
