package com.codecool.uml.overriding;

public abstract class AbstractProcess {

    void process(Orderable item) {
        stepBefore();
        action(item);
        stepAfter();
    }

    void stepBefore() {
        System.out.println("Step Before Action");
    }

    void stepAfter() {
        System.out.println("Step After Action");
    }

    abstract void action(Orderable item); {
    }
}

