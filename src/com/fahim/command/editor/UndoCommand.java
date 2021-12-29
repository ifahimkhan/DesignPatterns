package com.fahim.command.editor;

public class UndoCommand implements Command {
    CommandHistory history;

    public UndoCommand(CommandHistory history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if (history.size() > 0) {
            history.pop().undoExecute();
        }
    }
}
