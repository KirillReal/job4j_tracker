package ru.job4j.tracker;

public class TrackerEagerLoad {
    private static final TrackerEagerLoad INSTANCE = new TrackerEagerLoad();

    private TrackerEagerLoad() {
    }

    public static TrackerEagerLoad getInstance() {
        return INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        TrackerEagerLoad tracker = TrackerEagerLoad.getInstance();
    }
}
