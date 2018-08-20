package com.codecool.uml.overriding;

public class Order implements Orderable {
    private static int orderCount = 0;
    private int id;
    private String status;

    Order() {
        id = orderCount++;
        status = "New";
    }

    public boolean checkout() {
        if (status.equals("New")) {
            status = "Checked";
            return true;
        } else {
            return false;
        }

    }

    public boolean pay() {
        if (status.equals("Checked")) {
            status = "Payed";
            return true;
        } else {
            return false;
        }
    }

    public String getStatus() {
        return status;
    }
}