package ru.geekbrains.lesson04.task3;

public class FillingDatabase {

    public FillingDatabase() {

    }

    public Database fillingDatabase(){
        Database database = new Database();
        Ticket ticket1 = new Ticket();
        Ticket ticket2 = new Ticket();
        Ticket ticket3 = new Ticket();

        database.addTicket(ticket1);
        database.addTicket(ticket2);
        database.addTicket(ticket3);

        Customer customer1 = new Customer("11000000221");
        Customer customer2 = new Customer("11000000228");
        Customer customer3 = new Customer("11000000324");

        database.addCustomer(customer1);
        database.addCustomer(customer2);
        database.addCustomer(customer3);
        return database;
    }
}
