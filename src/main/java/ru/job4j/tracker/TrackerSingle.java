package ru.job4j.tracker;

public enum  TrackerSingle {
    INSTANCE;
    private final Tracker tracker = new Tracker();
    public Tracker getInstance() {
        return tracker;
    }
}
