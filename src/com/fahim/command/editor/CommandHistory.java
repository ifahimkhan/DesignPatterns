package com.fahim.command.editor;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class CommandHistory {
    private Deque<UndoableCommand> commandList = new ArrayDeque<>();

    public void push(UndoableCommand command) {
        commandList.add(command);
    }

    public UndoableCommand pop() {
        return commandList.pop();
    }
    public int size(){
       return commandList.size();
    }

}
