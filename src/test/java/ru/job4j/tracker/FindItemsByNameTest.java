package ru.job4j.tracker;

import org.junit.Test;

import java.sql.SQLException;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FindItemsByNameTest {

    @Test
    public void whenExecuteThenSuccess() throws SQLException {
        Output out = new StubOutput();
        Store tracker = new MemTracker();
        tracker.add(new Item("Item"));
        FindItemsByName action = new FindItemsByName(out);
        Input input = mock(Input.class);
        when(input.askInt(any(String.class))).thenReturn(1);
        action.execute(input, tracker);

        assertEquals(1, tracker.findAll().size());
    }

    @Test
    public void whenExecuteThenError() throws SQLException {
        Output out = new StubOutput();
        Store tracker = new MemTracker();
        tracker.add(new Item("Item"));
        FindItemsByName action = new FindItemsByName(out);

        Input input = mock(Input.class);
        action.execute(input, tracker);

        String ln = System.lineSeparator();
        assertThat(
                out.toString(),
                is("=== Find items by name ===" + ln + "Array is empty" + ln)
        );
    }
}