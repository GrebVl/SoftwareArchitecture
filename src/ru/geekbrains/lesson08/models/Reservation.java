package ru.geekbrains.lesson08.models;

import javax.xml.crypto.Data;

public class Reservation {
    private static int counter = 1000;
    private final int id;
    private Table table;
    private Data data;
    private String name;

    {
        id = ++counter;
    }

    public Reservation(Table table, Data data, String name) {
        this.table = table;
        this.data = data;
        this.name = name;
    }

    public int getId() {
        return id;
    }

}
