package ru.geekbrains.lesson04.task3;

import java.util.Date;

/**
 * Билет
 */

public class Ticket {
    private static int counter;
    private int id;
    private int customerId;
    private Date date;
    private String qrcode;
    private boolean enable = true;

    {
        id = ++counter;
    }

    public Ticket(){
        this.date = new Date();
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public int getId() {
        return id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public Date getDate() {
        return date;
    }

    public String getQrcode() {
        return qrcode;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }
}
