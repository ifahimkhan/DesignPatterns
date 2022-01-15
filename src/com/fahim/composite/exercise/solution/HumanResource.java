package com.fahim.composite.exercise.solution;

public class HumanResource implements ComponentInterface {

    @Override
    public void deploy() {
        System.out.println("Deploying a human resource");
    }
}
