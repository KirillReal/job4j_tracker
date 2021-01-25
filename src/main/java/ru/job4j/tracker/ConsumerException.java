package ru.job4j.tracker;

import java.sql.SQLException;

@FunctionalInterface
public interface ConsumerException<T, U>  {
    void accept(T t, U u) throws SQLException;
}
