package com.fahim.strategypattern.challenge.solution;

public class DESEncryption implements Encryption {
    @Override
    public String encrypt(String message) {

        System.out.println("Applying DES Encryption"+message+" to #######");
        return "######";
    }
}
