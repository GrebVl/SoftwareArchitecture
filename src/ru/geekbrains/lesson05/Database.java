package ru.geekbrains.lesson05;

import java.util.Collection;

/**
 * Интерфейс БД
 */

public interface Database {
    void load();
    void save();
    Collection<Entity> getAll();
}
