package com.fahim.strategypattern.challenge.solution;

public class Main {
    public static void main(String[] args) {
        ChatClient chatClient=new ChatClient(new DESEncryption());
        chatClient.send("Hi Fahim");
    }
}
