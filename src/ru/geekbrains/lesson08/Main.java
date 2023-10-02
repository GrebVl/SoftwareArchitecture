package ru.geekbrains.lesson08;

import ru.geekbrains.lesson08.models.TableModel;
import ru.geekbrains.lesson08.presenters.BookingPresenter;
import ru.geekbrains.lesson08.presenters.Model;
import ru.geekbrains.lesson08.presenters.View;
import ru.geekbrains.lesson08.views.BookingView;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        View view = new BookingView();
        Model model = new TableModel();
        BookingPresenter presenter = new BookingPresenter(model, view);

        presenter.updateUIShowTables();

        view.reservationTable(new Date(), 2, "Станислав");
        view.reservationTable(new Date(), 4, "Станислав");

        presenter.updateUIShowTables();

        view.changeReservationTable(1001, new Date(), 3, "Станислав");
        view.changeReservationTable(1002, new Date(), 5, "Станислав");

        presenter.updateUIShowTables();

    }
}
