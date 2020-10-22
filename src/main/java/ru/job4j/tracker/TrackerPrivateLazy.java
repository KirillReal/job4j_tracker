package ru.job4j.tracker;

public class TrackerPrivateLazy {
    private TrackerPrivateLazy() {
    }

    public static TrackerPrivateLazy getInstance() {
        return Holder.INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    private static final class Holder {
        private static final TrackerPrivateLazy INSTANCE = new TrackerPrivateLazy();
    }

    public static void main(String[] args) {
        TrackerPrivateLazy tracker = TrackerPrivateLazy.getInstance();
    }
}
