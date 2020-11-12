package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public List<Item> findAll() {
       return (ArrayList<Item>) items;
    }

    public List<Item> findByName(String key) {
        int size = 0;
        List<Item> equalName = new ArrayList<>();
        for (int index = 0; index < items.size(); index++) {
            Item name = items.get(index);
            if (name.getName().equals(key)) {
                equalName.add(name);
            }
        }
        return equalName;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean check = index != -1;
        if (check) {
            item.setId(id);
            items.set(index, item);
            check = true;
        }
        return check;
    }

    public Item findById(int id) {
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1 ? items.get(index) : null;
    }

    public boolean delete(int id) {
        boolean check = false;
        int index = indexOf(id);
        if (index != -1) {
            //System.arraycopy(items, index + 1, items, index, size - index);
            items.remove(index);
            check = true;
        }
        return check;
    }
}
