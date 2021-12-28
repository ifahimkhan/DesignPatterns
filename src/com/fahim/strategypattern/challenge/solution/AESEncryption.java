package com.fahim.strategypattern.challenge.solution;

public class AESEncryption implements Encryption{
    @Override
    public String encrypt(String message) {
        System.out.println("Applying AES Encryption"+message+" to *******");
        return "*******";
    }
}
