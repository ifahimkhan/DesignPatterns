package com.fahim.command.editor;

public interface UndoableCommand extends Command {
    void undoExecute();
}
