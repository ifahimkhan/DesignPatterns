package com.fahim.command.editor;

public class BoldCommand implements UndoableCommand {
    private String prevContent;
    private HtmlDocument htmlDocument;
    CommandHistory commandHistory;

    public BoldCommand(HtmlDocument htmlDocument, CommandHistory commandHistory) {
        this.htmlDocument = htmlDocument;
        this.commandHistory = commandHistory;
    }

    @Override
    public void execute() {
        prevContent = htmlDocument.getContent();
        htmlDocument.makeBold();
        commandHistory.push(this);
    }

    @Override
    public void undoExecute() {
        htmlDocument.setContent(prevContent);
    }
}
