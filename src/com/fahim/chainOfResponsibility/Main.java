package com.fahim.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Encryptor encryptor=new Encryptor(null);
        Compressor compressor = new Compressor(encryptor);
        Logging logging = new Logging(compressor);
        Authenticator authenticator = new Authenticator(logging);
        WebServer server=new WebServer(authenticator);
        server.handle(new HttpRequest("fahim","1234"));

    }
}
