package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrackerPrivateLazyTest {

    @Test
    public void getInstance() {
        final Tracker tracker = TrackerSingleLazyLoad.getInstance().getTracker();
        final Tracker tracker1 = TrackerSingleLazyLoad.getInstance().getTracker();
        assertSame(tracker,tracker1);
    }
}