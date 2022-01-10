package com.fahim.visitor;

public interface Operation {
    void apply(HeadingNode node);
    void apply(AnchorNode node);
}
