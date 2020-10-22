package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrackerSingleLazyLoadTest {

    @Test
    public void getInstance() {
        final TrackerSingleLazyLoad trackerSingleLazyLoad = TrackerSingleLazyLoad.getInstance();
        final TrackerSingleLazyLoad trackerSingleLazyLoad1 = TrackerSingleLazyLoad.getInstance();
        assertSame(trackerSingleLazyLoad,trackerSingleLazyLoad1);
    }
}