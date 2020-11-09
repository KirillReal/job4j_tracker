package ru.job4j.tracker;

public class TrackerSingleLazyLoad {
    private static TrackerSingleLazyLoad instance;

    private final Tracker tracker = new Tracker();
    private TrackerSingleLazyLoad() {
    }

    public static TrackerSingleLazyLoad getInstance() {
        if (instance == null) {
            instance = new TrackerSingleLazyLoad();
        }
        return instance;
    }

    public Tracker getTracker(){
        return tracker;
    }
}
