package com.fahim.statePattern;

public class BrushTool implements Tool{

    @Override
    public void mouseDown() {
        System.out.println("shows Brush Icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a rectangle with Brush");
    }
}
