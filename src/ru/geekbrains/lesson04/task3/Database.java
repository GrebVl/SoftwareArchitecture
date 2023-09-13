package ru.geekbrains.lesson04.task3;

import java.util.ArrayList;
import java.util.Collection;

/**
 * База данных
 */

public class Database {
    private static int counter;
    private Collection<Ticket> tickets = new ArrayList<>();
    private Collection<Customer> customers = new ArrayList<>();

    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public Collection<Customer> getCustomers() {

        return customers;
    }

    /**
     * Получить актуальную стоимость
     * @return
     */

    public double getTicketAmount(){
        return 45;
    }

    /**
     * Получить идентификатор заявки на покупку билета
     * @param clientId
     * @return
     */
    public int createTicketOrder(int clientId){
        return ++counter;
    }

    public void addTicket(Ticket ticket){
        tickets.add(ticket);
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }
}
