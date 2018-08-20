package com.codecool.uml.overriding;

public class Webshop {

    public static void main(String[] args) {
        Order order1 = new Order();

        System.out.println("Order 1");
        System.out.println("Status of order1: " + order1.getStatus());
        order1.checkout();
        System.out.println("Status of order1: " + order1.getStatus());
        order1.pay();
        System.out.println("Status of order1: " + order1.getStatus());


        System.out.println("Using the Processes");
        Order order2 = new Order();
        System.out.println("Status of order2: " + order2.getStatus());
        CheckoutProcess cp = new CheckoutProcess();
        PaymentProcess pp = new PaymentProcess();
        pp.process(order2);
        System.out.println("Status of order2: " + order2.getStatus());
        cp.process(order2);
        System.out.println("Status of order2: " + order2.getStatus());
        cp.process(order2);
        System.out.println("Status of order2: " + order2.getStatus());
        pp.process(order2);
        System.out.println("Status of order2: " + order2.getStatus());

    }
}
