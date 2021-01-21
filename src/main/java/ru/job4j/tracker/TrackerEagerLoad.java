package ru.job4j.tracker;

public class TrackerEagerLoad {
    private static final TrackerEagerLoad INSTANCE = new TrackerEagerLoad();

    private final MemTracker tracker = new MemTracker();

    private TrackerEagerLoad() {
    }

    public static TrackerEagerLoad getInstance() {
        return INSTANCE;
    }

    public MemTracker getTracker() {
        return tracker;
    }

    public static void main(String[] args) {
        TrackerEagerLoad tracker = TrackerEagerLoad.getInstance();
    }
}
