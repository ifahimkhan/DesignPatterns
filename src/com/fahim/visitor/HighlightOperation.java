package com.fahim.visitor;

public class HighlightOperation implements Operation{
    @Override
    public void apply(HeadingNode node) {
        System.out.println("Highlight HeadingNode");

    }

    @Override
    public void apply(AnchorNode node) {
        System.out.println("Highlight AnchorNode");
    }
}
