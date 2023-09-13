package ru.geekbrains.lesson04.task3;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Покупатель
 */

public class Customer {
    private static int counter;
    private final int id;
    private String cardNo;
    private Collection<Ticket> tickets;

    {
        id = ++counter;
    }

    public Customer(String cardNo) {
        this.cardNo = cardNo;
    }

    public int getId() {
        return id;
    }

    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Collection<Ticket> tickets) {
        this.tickets = tickets;
    }

    public String getCardNo() {
        return cardNo;
    }
}
