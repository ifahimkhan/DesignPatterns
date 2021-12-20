package com.fahim.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> listOfState = new ArrayList<>();

    public void push(EditorState state) {
        listOfState.add(state);
    }

    public EditorState pop() {
        int lastIndex = listOfState.size() - 1;
        if (lastIndex > -1) {
            EditorState lastState = listOfState.get(lastIndex);
            listOfState.remove(lastIndex);
            return lastState;
        } else return null;
    }
}
