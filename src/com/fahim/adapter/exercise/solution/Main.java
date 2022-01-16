package com.fahim.adapter.exercise.solution;

import com.fahim.adapter.exercise.Gmail.GmailClient;

public class Main {
    public static void main(String[] args) {
        EmailClient emailClient = new EmailClient();
        emailClient.addProvider(new GmailClientAdapter(new GmailClient()));
        emailClient.downloadEmails();
    }
}
