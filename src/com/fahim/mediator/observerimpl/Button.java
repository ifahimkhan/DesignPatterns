package com.fahim.mediator.observerimpl;

import com.fahim.mediator.DialogBox;

public class Button extends UIControl {
    private boolean isEnabled;


    public boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
        notifyObserver();
    }
}
