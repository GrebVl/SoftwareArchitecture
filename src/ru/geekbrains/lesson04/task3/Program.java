package ru.geekbrains.lesson04.task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Program {

    /**
     * Разработать контракты и компоненты системы "Покупка онлайн билетов на автобус в час пик".
     *
     * 1.  Предусловия.
     * 2.  Постусловия.
     * 3.  Инвариант.
     * 4.  Определить абстрактные и конкретные классы.
     * 5.  Определить интерфейсы.
     * 6.  Реализовать наследование.
     * 7.  Выявить компоненты.
     * 8.  Разработать Диаграмму компонент использую нотацию UML 2.0. Общая без деталей.
     */

    public static void main(String[] args) {
        FillingDatabase fillingDatabase = new FillingDatabase();
        Database database = fillingDatabase.fillingDatabase();



        Core core = new Core(database);
        BusStation busStation = new BusStation(core.getTicketProvider());

        MobileApp mobileApp = new MobileApp(core.getTicketProvider(), core.getCustomerProvider(), "11000000221");
        if(mobileApp.buyTicket()){
            System.out.println("Клиент успешно купил билет");
            mobileApp.searchTicket(new Date());
            Collection<Ticket> tickets = mobileApp.getTickets();
            if(busStation.checkTicket(tickets.stream().findFirst().get().getQrcode())){
                System.out.println("Клиент успешно прошел в автобус");
            }

        }



    }
}
