package ru.job4j.tracker;

public class TrackerEagerLoad {
    private static final TrackerEagerLoad INSTANCE = new TrackerEagerLoad();

    private Tracker tracker = new Tracker();
    private TrackerEagerLoad() {
    }

    public static TrackerEagerLoad getInstance() {
        return INSTANCE;
    }

    public Tracker getTracker(){
        return tracker;
    }

    public static void main(String[] args) {
        TrackerEagerLoad tracker = TrackerEagerLoad.getInstance();
    }
}