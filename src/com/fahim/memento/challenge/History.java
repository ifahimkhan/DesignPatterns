package com.fahim.memento.challenge;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class History {
    private Deque<DocumentState> listOfState = new ArrayDeque<>();

    public void push(DocumentState state) {
        listOfState.push(state);
    }

    public DocumentState pop() {
        return listOfState.pop();
    }
}
