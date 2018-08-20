package com.codecool.uml.overriding;

public class PaymentProcess extends AbstractProcess {
    void action(Orderable item) {
        System.out.println("Payment started!");
        if (item.pay()) {
            System.out.println("Successful payment!");
        } else {
            System.out.println("Some error happened during payment!");
        }
    }
}
