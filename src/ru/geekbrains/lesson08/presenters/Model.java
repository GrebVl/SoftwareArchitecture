package ru.geekbrains.lesson08.presenters;

import ru.geekbrains.lesson08.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {
    Collection<Table> loadTables();

    int reservationTable(Date reservationDate, int tableNo, String name);

    int changeReservationTable(int noOldReservation, Date orderDate, int tableNo, String name);
}
