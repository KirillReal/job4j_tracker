package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenCreateItem() {
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new Exit()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }
    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        /* Добавим в tracker новую заявку */
        Item item = tracker.add(new Item("Replaced item"));
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        Item item2 = tracker.add(new Item("New item name"));
        String replacedName = item2.getName();
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item2.getId()), item2.getName(), "1"}
        );
        UserAction[] actions = {
                new ReplaceAction(),
                new Exit()
        };
        new StartUI().init(in, tracker, actions);
        Item replaced = tracker.findById(item2.getId());
        assertThat(replaced.getName(), is(replacedName));
    }
    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        /* Добавим в tracker новую заявку */
        Item item = tracker.add(new Item("Deleted item"));
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        Input in = new StubInput(
                new String[] {"0" ,String.valueOf(item.getId()),"1"}
        );
        UserAction[] actions = {
                new DeleteAction(),
                new Exit()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }
}