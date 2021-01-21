package ru.job4j.tracker;

import java.sql.SQLException;

public class FindById implements UserAction {
    private final Output out;

    public FindById(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Find item by Id ===";
    }

    @Override
    public boolean execute(Input input, Store tracker) throws SQLException {
        //int id = Integer.valueOf(input.askStr("Enter the id you want to find:"));
        int id = input.askInt("Enter the id of the application:");
        Item obj = tracker.findById(id);
        if (obj != null) {
            out.println(obj);
        } else {
            out.println("Id is not found");
        }
        return true;
    }
}
