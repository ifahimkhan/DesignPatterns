package com.fahim.chainOfResponsibility;

public class WebServer {
    Handler handler;

    public WebServer(Handler handler) {
        this.handler = handler;
    }

    public void handle(HttpRequest request) {
        handler.handle(request);
        //authentication
        //logging
        //compression...

    }
}
