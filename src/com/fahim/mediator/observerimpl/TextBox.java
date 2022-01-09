package com.fahim.mediator.observerimpl;

import com.fahim.mediator.DialogBox;

public class TextBox extends UIControl {
    private String content;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyObserver();
    }
}
