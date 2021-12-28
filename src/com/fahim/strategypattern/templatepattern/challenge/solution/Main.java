package com.fahim.strategypattern.templatepattern.challenge.solution;

public class Main {
    public static void main(String[] args) {
        Window window=new LogcatWindow();
        window.close();
        window=new BuildWindow();
        window.close();
    }
}
