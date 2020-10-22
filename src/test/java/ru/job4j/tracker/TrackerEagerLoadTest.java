package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrackerEagerLoadTest {

    @Test
    public void getInstance() {
        final TrackerEagerLoad trackerEagerLoad = TrackerEagerLoad.getInstance();
        final TrackerEagerLoad trackerEagerLoad1 = TrackerEagerLoad.getInstance();
        assertSame(trackerEagerLoad,trackerEagerLoad1);
    }
}