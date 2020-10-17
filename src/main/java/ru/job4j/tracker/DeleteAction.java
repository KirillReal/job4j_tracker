package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "=== Delete item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.valueOf(input.askStr("Enter the id you want to delete:"));
        if (tracker.delete(id)) {
            System.out.println("Order deletion completed");
        } else {
            System.out.println("Error");
        }
        return true;
    }
}
