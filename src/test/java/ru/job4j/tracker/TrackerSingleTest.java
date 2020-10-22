package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrackerSingleTest {

    @Test
    public void getInstance() {
        final Tracker instance = TrackerSingle.INSTANCE.getInstance();
        final Tracker instanceCheck = TrackerSingle.INSTANCE.getInstance();
        assertSame(instance,instanceCheck);
     }
}