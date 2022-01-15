package com.fahim.composite.exercise.solution;

import java.util.ArrayList;
import java.util.List;

public class Team implements ComponentInterface {
    private List<ComponentInterface> list=new ArrayList<>();
    public void add(ComponentInterface componentInterface){
        list.add(componentInterface);
    }
    @Override
    public void deploy() {
        for (var component:list){
            component.deploy();
        }
    }
}
