package com.fahim.chainOfResponsibility.soultion;


public class QuickBookReader extends DataReader {
    @Override
    public String getExtension() {
        return ".qbw";
    }

    @Override
    public void doRead() {
        System.out.println("Reading data from QuickBook SpreadSheet");
    }
}
