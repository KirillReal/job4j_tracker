package ru.job4j.tracker;

public class ReplaceAction implements UserAction{
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "=== Replace item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int inputUser = Integer.valueOf(input.askStr("Enter id selected item:"));
        out.println("=== Replace Item ====");
        String name = input.askStr("Enter new name:");
        Item item = new Item(name);
        if (tracker.replace(inputUser, item)) {
            out.println("Replacement of the application completed");
        } else {
            out.println("Id is not found");
        }
        return true;
    }
}
