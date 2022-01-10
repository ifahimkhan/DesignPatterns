package com.fahim.chainOfResponsibility;

public class Authenticator extends Handler {

    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("authentication");
        boolean isValid = (request.getUsername() == "fahim"
                && request.getPassword() == "1234");
        return !isValid;
    }
}
