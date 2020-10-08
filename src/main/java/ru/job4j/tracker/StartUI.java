package ru.job4j.tracker;
import javax.imageio.ImageTranscoder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class StartUI {
    public static void main(String[] args) {
        Tracker obj = new Tracker();
        Item first = new Item(1, "Sergey");
        Item second = new Item(2,"Nikolay");
        Item third = new Item(3,"Oleg");
        obj.add(first);
        obj.add(second);
        obj.add(third);
        Item check = obj.findById(1);
        System.out.println(check);
    }
}
