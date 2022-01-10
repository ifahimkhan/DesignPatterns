package com.fahim.chainOfResponsibility.soultion;

public class DataReaderFactory {
    public static DataReader createChainOfResponsibility() {
        ExcelReader excelReader = new ExcelReader();
        QuickBookReader quickBookReader = new QuickBookReader();
        NumbersReader numbersReader = new NumbersReader();

        excelReader.setNextDataReader(numbersReader);
        numbersReader.setNextDataReader(quickBookReader);

        return excelReader;
    }
}
