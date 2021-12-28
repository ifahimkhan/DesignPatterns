package com.fahim.strategypattern.templatepattern.challenge.solution;

public class LogcatWindow extends Window {

    @Override
    protected void onClosing() {
        System.out.println("stop logging");
    }

    @Override
    protected void onClosed() {
        System.out.println("Release Log memory");
    }
}
