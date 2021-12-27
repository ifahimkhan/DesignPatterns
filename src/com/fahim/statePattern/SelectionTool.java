package com.fahim.statePattern;

public class SelectionTool implements Tool{

    @Override
    public void mouseDown() {
        System.out.println("shows Selection Icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Select some object");
    }
}
