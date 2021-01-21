package ru.job4j.tracker;

public class TrackerPrivateLazy {
    private final MemTracker tracker = new MemTracker();

    private TrackerPrivateLazy() {
    }

    public static TrackerPrivateLazy getInstance() {
        return Holder.INSTANCE;
    }

    private static final class Holder {
        private static final TrackerPrivateLazy INSTANCE = new TrackerPrivateLazy();
    }

    public MemTracker getTracker() {
        return tracker;
    }

    public static void main(String[] args) {
        TrackerPrivateLazy tracker = TrackerPrivateLazy.getInstance();
    }
}
