package com.fahim.chainOfResponsibility.soultion;

import javax.xml.crypto.Data;

public abstract class DataReader {

    DataReader dataReader;

    public void setNextDataReader(DataReader dataReader) {
        this.dataReader = dataReader;
    }

    public void read(String filename) {
        if (filename.endsWith(getExtension())) {
            doRead();
            return;
        }
        if (dataReader != null) {
            dataReader.read(filename);
        } else
            throw new UnsupportedOperationException("File format not supported.");

    }

    public abstract String getExtension();

    public abstract void doRead();

}
