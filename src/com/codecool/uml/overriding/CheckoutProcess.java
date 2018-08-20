package com.codecool.uml.overriding;

public class CheckoutProcess extends AbstractProcess {
    void action(Orderable item) {
        System.out.println("Checkout started!");
        if (item.checkout()) {
            System.out.println("Successful checkout!");
        } else {
            System.out.println("Some error happened during checkout!");
        }
    }
}

