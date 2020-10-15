package ru.job4j.tracker;

public class ShowAction implements UserAction{
    @Override
    public String name() {
        return "=== Show all items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] showAll = tracker.findAll();
        for (int index = 0; index < showAll.length; index++) {
            System.out.println(showAll[index].toString());
        }
        return true;
    }
}
