package ru.job4j.tracker;

import java.util.List;

public class FindItemsByName implements UserAction {
    private final Output out;

    public FindItemsByName(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "=== Find items by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find items by name ===");
        List<Item> item = tracker.findByName(input.askStr("=== Enter the name ==="));
        if (item.size() > 0) {
            for (int i = 0; i < item.size(); i++) {
                out.println(item.get(i));
            }
        } else {
            out.println("Array is empty");
        }
        return true;
    }
}
