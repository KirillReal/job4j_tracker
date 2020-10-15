package ru.job4j.tracker;

public class ReplaceAction implements UserAction{
    @Override
    public String name() {
        return "=== Replace item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int inputUser = Integer.valueOf(input.askStr("Enter id selected item:"));
        System.out.println();
        String name = input.askStr("Enter new name:");
        Item item = new Item(name);
        if (tracker.replace(inputUser, item)) {
            System.out.println("Replacement of the application completed");
        } else {
            System.out.println("Id is not found");
        }
        return true;
    }
}
