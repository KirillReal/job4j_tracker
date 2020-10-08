package ru.job4j.tracker;

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
       Item[] itemsWithoutNull = new Item[items.length];
       int size = 0;
       for(int i = 0; i < items.length;i++){
           Item itemW = items[i];
           if(itemW != null){
               itemsWithoutNull[size] = itemW;
               size++;
           }
           itemsWithoutNull = Arrays.copyOf(itemsWithoutNull, size);
       }
       return itemsWithoutNull;
    }
    public Item[] findByName(String key){
        int size = 0;
        Item[] equalName = new Item[items.length];
        for (int index = 0; index < items.length; index++) {
            Item name = items[index];
            if (name.getName().equals(key)) {
                equalName[size] = name;
                size++;
            }
        }
        return equalName;
    }
    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}
