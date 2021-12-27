package com.fahim.statePattern;


public class Main {
    public static void main(String[] args) {
        Canvas canvas=new Canvas();
        EraserTool eraserTool=new EraserTool();
//        SelectionTool selectionTool=new SelectionTool();
//        BrushTool brushTool=new BrushTool();

        canvas.setCurrentTool(eraserTool);
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
