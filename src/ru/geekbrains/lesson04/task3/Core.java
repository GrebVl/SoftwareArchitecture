package ru.geekbrains.lesson04.task3;

public class Core {

    private final CustomerProvider customerProvider;
    private final TicketProvider ticketProvider;
    private final PaymentProvider paymentProvider;
    private final Database database;

    public Core(Database database){
        this.database = database;
        customerProvider = new CustomerProvider(database);
        paymentProvider = new PaymentProvider();
        ticketProvider = new TicketProvider(database, paymentProvider);
    }

    public TicketProvider getTicketProvider() {
        return ticketProvider;
    }

    public CustomerProvider getCustomerProvider() {
        return customerProvider;
    }

}
