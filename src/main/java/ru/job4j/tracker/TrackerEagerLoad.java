package ru.job4j.tracker;

public class TrackerEagerLoad {
    private static final TrackerEagerLoad instance = new TrackerEagerLoad();

    private final Tracker tracker = new Tracker();
    private TrackerEagerLoad() {
    }

    public static TrackerEagerLoad getInstance() {
        return instance;
    }

    public Tracker getTracker(){
        return tracker;
    }

    public static void main(String[] args) {
        TrackerEagerLoad tracker = TrackerEagerLoad.getInstance();
    }
}
