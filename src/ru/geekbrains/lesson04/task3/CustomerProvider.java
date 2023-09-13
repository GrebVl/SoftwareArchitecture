package ru.geekbrains.lesson04.task3;

import java.util.ArrayList;


public class CustomerProvider {
    private Database database;
    private ArrayList<Customer> customers;


    public CustomerProvider(Database database) {
        this.database = database;
        customers = (ArrayList<Customer>) database.getCustomers();
    }

    public Customer getCustomer(String cardNo){
        for(int i = 0; i < customers.size(); i++){
            if(customers.get(i).getCardNo().equals(cardNo)){
                return customers.get(i);
            }
        }
        throw new RuntimeException("Такого пользователя нет");
    }

}
