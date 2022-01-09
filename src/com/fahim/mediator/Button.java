package com.fahim.mediator;

public class Button extends UIControl {
    private boolean isEnabled;

    public Button(DialogBox dialogBox) {
        super(dialogBox);
    }

    public boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
        owner.changed(this);
    }
}
