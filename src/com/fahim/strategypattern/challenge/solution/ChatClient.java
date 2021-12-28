package com.fahim.strategypattern.challenge.solution;

public class ChatClient {
    private Encryption encryptionAlgorithm;

    public ChatClient(Encryption encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public void send(String message) {
        System.out.println(encryptionAlgorithm.encrypt(message)+"Sending the encrypted message...");
    }
}
