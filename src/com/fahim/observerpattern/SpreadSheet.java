package com.fahim.observerpattern;

import javax.xml.crypto.Data;

public class SpreadSheet implements Observer {


    private DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Sheet got updated :"+dataSource.getValue());

    }
}
