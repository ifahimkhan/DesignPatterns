package com.fahim.mediator;

public class ListBox extends UIControl {
    private String Selection;

    public ListBox(DialogBox dialogBox) {
        super(dialogBox);
    }

    public String getSelection() {
        return Selection;
    }

    public void setSelection(String selection) {
        this.Selection=selection;
        owner.changed(this);
    }
}
