package ru.geekbrains.lesson04.task3;


import java.util.Collection;
import java.util.Date;

/**
 * Мобильное приложение
 */

public class MobileApp {
    private final Customer customer;
    private final TicketProvider ticketProvider;
    private final CustomerProvider customerProvider;

    public MobileApp(TicketProvider ticketProvider, CustomerProvider customerProvider, String carNo) {
        this.ticketProvider = ticketProvider;
        this.customerProvider = customerProvider;
        customer = customerProvider.getCustomer(carNo);
    }

    public Collection<Ticket> getTickets() {
        return customer.getTickets();
    }

    public void searchTicket(Date date){
        customer.setTickets(ticketProvider.searchTicket(customer.getId(), new Date()));
    }

    public boolean buyTicket(){
        return ticketProvider.buyTicket(customer.getId(), customer.getCardNo());
    }
}
