package com.fahim.decorator;

public class Main {
    public static void main(String[] args) {
        storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())));
    }
    public static void storeCreditCard(Stream stream){
        stream.write("1234-1324-1234-1234");
    }
}
