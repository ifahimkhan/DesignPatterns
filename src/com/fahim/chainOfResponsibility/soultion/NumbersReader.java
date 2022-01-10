package com.fahim.chainOfResponsibility.soultion;


public class NumbersReader extends DataReader {
    @Override
    public String getExtension() {
        return ".numbers";
    }

    @Override
    public void doRead() {
        System.out.println("Reading data from Numbers SpreadSheet");
    }
}
