package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SortByNameTest {

    @Test
    public void reverse() {
        Item item = new Item("Ivan");
        Item item1 = new Item("Peter");

        SortByName reverse = new SortByName();
        int selected = reverse.compare(item, item1);
        assertThat(selected, is(-7));
    }
}