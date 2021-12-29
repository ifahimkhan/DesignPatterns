package com.fahim.command.editor;

public class ItalicCommand implements UndoableCommand {
    private String prevContent;
    private HtmlDocument htmlDocument;
    CommandHistory commandHistory;

    public ItalicCommand(HtmlDocument htmlDocument, CommandHistory commandHistory) {
        this.htmlDocument = htmlDocument;
        this.commandHistory = commandHistory;
    }

    @Override
    public void execute() {
        prevContent = htmlDocument.getContent();
        htmlDocument.makeItalic();
        commandHistory.push(this);
    }

    @Override
    public void undoExecute() {
        htmlDocument.setContent(prevContent);
    }
}
