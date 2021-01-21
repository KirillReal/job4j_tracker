package ru.job4j.tracker;

import java.sql.SQLException;

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
    public boolean execute(Input input, Store tracker) throws SQLException {
        int id = input.askInt("Enter the id you want to delete:");
        if (tracker.delete(id)) {
            out.println("Order deletion completed");
        } else {
            out.println("Error");
        }
        return true;
    }
}
