package com.fahim.chainOfResponsibility;

public class Logging extends Handler {

    public Logging(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("logging");
        return false;
    }
}
