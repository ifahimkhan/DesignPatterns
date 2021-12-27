package com.fahim.statePattern;

public class EraserTool implements Tool{

    @Override
    public void mouseDown() {
        System.out.println("shows Erase Icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Erase something");
    }
}
