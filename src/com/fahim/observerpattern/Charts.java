package com.fahim.observerpattern;

public class Charts implements Observer{
    private DataSource dataSource;

    public Charts(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Charts got updated:"+dataSource.getValue());

    }
}
