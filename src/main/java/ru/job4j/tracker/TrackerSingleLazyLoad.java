package ru.job4j.tracker;

public class TrackerSingleLazyLoad {
    private static TrackerSingleLazyLoad instance;

    private final MemTracker tracker = new MemTracker();

    private TrackerSingleLazyLoad() {
    }

    public static TrackerSingleLazyLoad getInstance() {
        if (instance == null) {
            instance = new TrackerSingleLazyLoad();
        }
        return instance;
    }

    public MemTracker getTracker() {
        return tracker;
    }
}
