package com.fahim.adapter;

public class VividFilter implements Filter{
    @Override
    public void apply(Image image) {
        System.out.println("Appying Vivid Filter");
    }
}
