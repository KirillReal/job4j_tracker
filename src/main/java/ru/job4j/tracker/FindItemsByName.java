package ru.job4j.tracker;

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
        Item[] obj = tracker.findByName(input.askStr("Enter name: "));
        if (obj.length != 0) {
            for (int i = 0; i < obj.length; i++) {
                out.println(obj[i].toString());
            }
        } else {
            out.println("Array is empty");
        }
        return true;
    }
}
