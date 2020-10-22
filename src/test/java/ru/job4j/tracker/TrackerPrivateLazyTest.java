package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrackerPrivateLazyTest {

    @Test
    public void getInstance() {
        final TrackerPrivateLazy trackerPrivateLazy = TrackerPrivateLazy.getInstance();
        final TrackerPrivateLazy trackerPrivateLazy1 = TrackerPrivateLazy.getInstance();
        assertSame(trackerPrivateLazy,trackerPrivateLazy1);
    }
}