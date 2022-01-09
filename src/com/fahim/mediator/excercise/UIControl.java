package com.fahim.mediator.excercise;


import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    protected List<EventHandler> eventHandlerList = new ArrayList<>();

    public void addEventHandler(EventHandler eventHandler) {
        eventHandlerList.add(eventHandler);
    }

    public void notifyEvents() {
        for (EventHandler eventHandler : eventHandlerList) {
            eventHandler.updateEvent();
        }
    }
}
