package com.fahim.composite;

public class Main {
    public static void main(String[] args) {

        Group rootGroup = new Group();
        Group group1=new Group();
        Group group2=new Group();
        group1.add(new Shape());
        group1.add(new Shape());
        group2.add(new Shape());
        group2.add(new Shape());

        rootGroup.add(group1);
        rootGroup.add(group2);

        rootGroup.render();
    }
}
