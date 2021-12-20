package com.fahim.statepattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
//        canvas.setCurrentTool(new EraserTool());
//        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
