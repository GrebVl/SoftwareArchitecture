package ru.geekbrains.lesson08.presenters;

import java.util.Date;

public interface ViewObserver {
    void onReservationTable(Date orderDate, int tableNo, String name);

    void changeReservationTable(int noOldReservation, Date orderDate, int tableNo, String name);
}
