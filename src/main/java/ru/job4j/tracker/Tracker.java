package ru.job4j.tracker;

import javax.swing.*;
import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }
    public Item[] findAll(){
       return Arrays.copyOf(items, size);
    }
    public Item[] findByName(String key){
        int size = 0;
        Item[] equalName = new Item[this.size];
        for (int index = 0; index < this.size; index++) {
            Item name = items[index];
            if (name.getName().equals(key)) {
                equalName[size] = name;
                size++;
            }
        }
        return Arrays.copyOf(equalName,size);
    }
    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }
    public boolean replace(int id,Item item) {
        int index = indexOf(id);
        boolean check = index != -1;
        if (check) {
            item.setId(id);
            items[index] = item;
            check = true;
        }
        return check;
    }

    public Item findById(int id) {
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1 ? items[index] : null;
    }
    public boolean delete(int id) {
        boolean check = false;
        int index = indexOf(id);
        if(index != -1){
            System.arraycopy(items, index + 1, items, index, size - index);
            items[size - 1] = null;
            size--;
            check = true;
        }
        return check;
    }
}
