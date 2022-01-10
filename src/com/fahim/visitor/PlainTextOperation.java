package com.fahim.visitor;

public class PlainTextOperation implements Operation{
    @Override
    public void apply(HeadingNode node) {
        System.out.println("text- heading Node");
    }

    @Override
    public void apply(AnchorNode node) {
        System.out.println("text- anchor Node");
    }
}
