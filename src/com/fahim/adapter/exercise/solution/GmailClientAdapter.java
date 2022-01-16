package com.fahim.adapter.exercise.solution;

import com.fahim.adapter.exercise.Gmail.GmailClient;

public class GmailClientAdapter implements EmailProvider {
    private GmailClient gmailClient;

    public GmailClientAdapter(GmailClient gmailClient) {
        this.gmailClient = gmailClient;
    }

    @Override
    public void downloadEmails() {
        gmailClient.connect();
        gmailClient.getEmails();
        gmailClient.disconnect();
    }
}

