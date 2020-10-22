package ru.job4j.tracker;

public enum  TrackerSingle {
    INSTANCE;
    private Tracker tracker = new Tracker();
    public Tracker getInstance(){
        return tracker;
    }
}
