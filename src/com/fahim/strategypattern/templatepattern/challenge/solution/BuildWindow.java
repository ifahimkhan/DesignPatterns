package com.fahim.strategypattern.templatepattern.challenge.solution;

public class BuildWindow extends Window {

    @Override
    protected void onClosing() {
        System.out.println("stop Building");
    }

    @Override
    protected void onClosed() {
        System.out.println("Release Build memory");
    }
}
