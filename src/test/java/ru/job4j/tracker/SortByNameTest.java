package ru.job4j.tracker;

import org.junit.Test;

import java.util.Collection;
import java.util.zip.DeflaterInputStream;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SortByNameTest {

    @Test
    public void Reverse(){
        Item item = new Item ("Ivan");
        Item item1 = new Item ("Peter");

        SortByName reverse = new SortByName();
        int selected = reverse.compare(item, item1);
        assertThat(selected, is(-7));
    }
}