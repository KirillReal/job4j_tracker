package ru.job4j.tracker;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class StartUI {
    public static void main(String[] args) {
        Item obj = new Item();
        LocalDateTime Item = obj.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String ItemData = Item.format(formatter);
        System.out.println(ItemData);
    }
}
