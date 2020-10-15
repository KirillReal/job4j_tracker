package ru.job4j.tracker;

public class FindById implements UserAction {
    @Override
    public String name() {
        return "=== Find item by Id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.valueOf(input.askStr("Enter the id you want to find:"));
        Item obj = tracker.findById(id);
        if (obj != null) {
            System.out.println(obj);
        } else {
            System.out.println("Id is not found");
        }
        return true;
    }
}
