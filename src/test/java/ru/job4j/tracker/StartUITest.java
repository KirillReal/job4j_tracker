package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Input in =  new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        UserAction[] actions = {
                new CreateAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in,tracker,actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        /* Добавим в tracker новую заявку */
        Item item = tracker.add(new Item("Replaced item"));
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), replacedName, "1"}
        );
        UserAction[] actions = {
                new ReplaceAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in,tracker,actions);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        /* Добавим в tracker новую заявку */
        Item item = tracker.add(new Item("Deleted item"));
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new DeleteAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in,tracker,actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Exit" + System.lineSeparator()
                        + "=== Exit ===" + System.lineSeparator()));
    }
    @Test
    public void whenFindAllAction() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Items"));
        Input in = new StubInput(
                new String[]
                        {"0","Items","1",}
        );
        UserAction[] actions = {
                new ShowAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in,tracker,actions);
        assertThat(out.toString(), is("Menu." + System.lineSeparator()
                + "1. Show all items" + System.lineSeparator()
                + "2. Exit" + System.lineSeparator()
                + "Menu." + System.lineSeparator()
                + "1. Show all items" + System.lineSeparator()
                + "2. Exit" + System.lineSeparator()
                + "id: 1 " + "name: Items" + System.lineSeparator()
                + "Menu." + System.lineSeparator()
                + "1. Show all items" + System.lineSeparator()
                + "2. Exit" + System.lineSeparator()
                + "=== Exit ====" + System.lineSeparator()));
    }
    @Test
    public void whenFindById() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Item Name"));
        Input in = new StubInput(
                new String[]
                        {"0",String.valueOf(item.getId()),"1",}
        );
        UserAction[] actions = {
                new FindById(out),
                new Exit(out)
        };
        new StartUI(out).init(in,tracker,actions);
        Item findId = tracker.findById(item.getId());
        assertThat(findId.getId(), is(item.getId()));
    }
    @Test
    public void whenFindByName() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Item Name"));
        Input in = new StubInput(
                new String[]
                        {"0",String.valueOf(item.getId()),"1",}
        );
        UserAction[] actions = {
                new FindById(out),
                new Exit(out)
        };
        new StartUI(out).init(in,tracker,actions);
        Item findName = tracker.findById(item.getId());
        assertThat(findName.getName(), is(item.getName()));
    }

}