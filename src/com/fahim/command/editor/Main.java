package com.fahim.command.editor;

import com.fahim.command.*;
import com.fahim.command.fx.Button;

public class Main {
    public static void main(String[] args) {

        CommandHistory history = new CommandHistory();
        HtmlDocument document = new HtmlDocument();
        document.setContent("Hello world");

        BoldCommand boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());
        UndoCommand undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
        ItalicCommand italicCommand=new ItalicCommand(document,history);
        italicCommand.execute();
        System.out.println(document.getContent());
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
