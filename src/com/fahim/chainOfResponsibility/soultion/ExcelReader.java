package com.fahim.chainOfResponsibility.soultion;


public class ExcelReader extends DataReader {
    @Override
    public String getExtension() {
        return ".xls";
    }

    @Override
    public void doRead() {
        System.out.println("Reading data from Excel SpreadSheet");
    }
}
