package com.fahim.mediator.observerimpl;

import com.fahim.mediator.DialogBox;

public class ListBox extends UIControl {

    private String Selection;

    public String getSelection() {
        return Selection;
    }

    public void setSelection(String selection) {
        this.Selection = selection;
        notifyObserver();
    }
}
