package com.fahim.chainOfResponsibility.soultion;

public class Main {
    public static void main(String[] args) {
        DataReader dataReader=DataReaderFactory.createChainOfResponsibility();
        try {

            dataReader.read("Fahim.xls");
            dataReader.read("Fahim.qbw");
            dataReader.read("Fahim.numbers");
            dataReader.read("Fahim.jpg");
        }catch (UnsupportedOperationException exception){
            System.out.println(exception.getLocalizedMessage());
        }
    }
}
