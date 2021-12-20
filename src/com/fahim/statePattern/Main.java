package com.fahim;

import com.fahim.statePattern.BrushTool;
import com.fahim.statePattern.Canvas;
import com.fahim.statePattern.EraserTool;
import com.fahim.statePattern.SelectionTool;

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
