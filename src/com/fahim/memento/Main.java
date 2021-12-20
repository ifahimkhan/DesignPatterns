package com.fahim.memento;

import com.fahim.memento.Editor;
import com.fahim.memento.History;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Editor editor = new Editor();
        History history = new History();
        editor.setContent("a");
        history.push(editor.createState());
        editor.setContent("b");
        history.push(editor.createState());
        editor.setContent("c");
        editor.restoreState(history.pop());
        editor.restoreState(history.pop());
        editor.restoreState(history.pop());
        System.out.println("Print Content \n" + editor.getContent());
    }
}
