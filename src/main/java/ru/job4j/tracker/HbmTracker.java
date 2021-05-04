package ru.job4j.tracker;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.sql.SQLException;
import java.util.List;

public class HbmTracker implements Store, AutoCloseable {
    private final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
            .configure().build();
    private final SessionFactory sf = new MetadataSources(registry)
            .buildMetadata().buildSessionFactory();

    @Override
    public void init() {

    }

    @Override
    public Item add(Item item) throws SQLException {
        try (Session session = sf.openSession()) {
            session.beginTransaction();
            session.save(item);
            session.getTransaction().commit();
        }
        return item;
    }

    @Override
    public boolean replace(int id, Item item) throws SQLException {
        try (Session session = sf.openSession()) {
            session.beginTransaction();
            Item itemNew = session.get(Item.class, id);
            if (itemNew != null) {
                itemNew.setName(item.getName());
                session.update(itemNew);
            } else {
                return false;
            }
            session.getTransaction().commit();
        }
        return true;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        boolean result = false;
        try (Session session = sf.openSession()) {
            session.beginTransaction();
            Item item = session.get(Item.class, id);
            if (item != null) {
                session.delete(item);
                result = true;
                session.getTransaction().commit();
            }
            return result;
        }
    }

    @Override
    public List<Item> findAll() throws SQLException {
        List<Item> result;
        try (Session session = sf.openSession()) {
            session.beginTransaction();
            result = session.createQuery("from Item", Item.class).list();
            session.getTransaction().commit();
        }
        return result;
    }

    @Override
    public List<Item> findByName(String key) throws SQLException {
        List<Item> list;
        try (Session session = sf.openSession()) {
            session.beginTransaction();
            list = session.createQuery(
                    "from Item where name = : paramName",
                    Item.class)
                    .setParameter("paramName", key)
                    .list();
            session.getTransaction().commit();
        }
        return list;
    }

    @Override
    public Item findById(int id) throws SQLException {
        Item item;
        try (Session session = sf.openSession()) {
            session.beginTransaction();
            item = session.get(Item.class, id);
            session.getTransaction().commit();
        }
        return item;
    }

    @Override
    public void close() throws Exception {
        StandardServiceRegistryBuilder.destroy(registry);
    }
}
