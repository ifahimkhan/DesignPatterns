package com.fahim.observerpattern;

public class Main {
    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        SpreadSheet spreadSheet = new SpreadSheet(dataSource);
        SpreadSheet spreadSheet1 = new SpreadSheet(dataSource);
        Charts charts = new Charts(dataSource);

        dataSource.addObserver(spreadSheet);
        dataSource.addObserver(spreadSheet1);
        dataSource.addObserver(charts);

        dataSource.setValue(1);

    }
}
