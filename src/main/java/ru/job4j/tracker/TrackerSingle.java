package ru.job4j.tracker;

public enum  TrackerSingle {
    INSTANCE;
    private final MemTracker tracker = new MemTracker();
    public MemTracker getInstance() {
        return tracker;
    }
}
