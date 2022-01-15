package com.fahim.composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component {
    private List<Component> list = new ArrayList<>();

    public void add(Component obj) {
        list.add(obj);
    }

    public void render() {
        for (Component obj : list) {
            obj.render();
        }
    }

    @Override
    public void move() {
        System.out.println("Move ");
    }
}
